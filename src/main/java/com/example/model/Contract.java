package com.example.model;

import com.example.enums.Settlement;
import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contract implements Serializable {

    @Id
    @NotNull
    private String number;

    @OneToOne
    @JoinColumn(name = "system_id")
    @NotNull
    private System system;

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @NotNull
    private Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @NotNull
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private Settlement settlement;

    @Min(0)
    @NotNull
    private double payment;

    private boolean status;


    public Contract(){};

    public Contract(String number, Date startDate, Date endDate, Settlement settlement, double payment, boolean status) {
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.settlement = settlement;
        this.payment = payment;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", settlement=" + settlement +
                ", payment=" + payment +
                ", status=" + status +
                ", system=" + system +
                '}';
    }
}

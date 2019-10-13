package com.example.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @NotNull
    private Long id;
    @Column(name = "company_name")
    @NotNull
    private String companyName;
    @NotNull
    private String address;
    @NotNull
    private String NIP;

    public Client(){};

    public Client(String companyName, String address, String NIP) {
        this.companyName = companyName;
        this.address = address;
        this.NIP = NIP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", NIP='" + NIP + '\'' +
                '}';
    }
}

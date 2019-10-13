package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class System implements Serializable {

    @Id
    @NotNull
    private String name;
    @OneToOne(mappedBy = "system")
    @JsonIgnore
    private Contract contract;
    @NotNull
    private String description;
    @NotNull
    private String technologies;
    @OneToOne
    private Client client;

    public System(){};

    public System(String name, String description, String technologies) {
        this.name = name;
        this.description = description;
        this.technologies = technologies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    @Override
    public String toString() {
        return "System{" +
                ", name='" + name + '\'' +
                ", contract=" + contract +
                ", description='" + description + '\'' +
                ", technologies='" + technologies + '\'' +
                ", client=" + client +
                '}';
    }
}

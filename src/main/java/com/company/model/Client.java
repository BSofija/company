package com.company.model;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {

    @Id
    private String companyName;



    public Client () {}

    public Client (String companyName) {
        super();
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

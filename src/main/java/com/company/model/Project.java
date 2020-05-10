package com.company.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pNumber;

    private String pName;




    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    @NotFound(action = NotFoundAction.IGNORE)
    private List<Employee> empro;

    @ManyToOne
    private Department dNum;

    @ManyToOne
    private Client client;

    public Project () {}

    public Project(Long pNumber, String pName, List<Employee> empro, Department dNum, Client client) {
        super();
        this.pNumber=pNumber;
        this.pName = pName;
        this.empro = empro;
        this.dNum = dNum;
        this.client = client;
    }

    public long getpNumber() {
        return pNumber;
    }

    public void setpNumber(long pNumber) {
        this.pNumber = pNumber;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}

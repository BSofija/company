package com.company.model;



import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptNumber;

    private String deptName;
    private String location;

    public Department () {}

    public Department(Long deptNumber, String deptName, String location) {
        super();
        this.deptNumber = deptNumber;
        this.deptName = deptName;
        this.location = location;
    }

    public Long getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(Long deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

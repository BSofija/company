package com.company.model;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;



    private String firstName;


    private String lastName;


    private String email;

    private int salary;

    @ManyToOne
    private Department dNum;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="employee_projects",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_num"))
    private List<Project> projects;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() { return salary;}

    public void setSalary(int salary) {this.salary = salary;}


    public Employee () {}

    public Employee(Long id, String firstName, String lastName, String email, int salary) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        //this.dNum = dNum;
        //this.projects = projects;
    }


}

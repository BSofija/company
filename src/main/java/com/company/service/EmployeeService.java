package com.company.service;

import com.company.model.Employee;
import com.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAll () {return employeeRepository.findAll();}

    public Employee addNewEmployee(Long id, String firstName, String lastName, String email, int salary) {
        Employee employee = new Employee(id, firstName, lastName, email, salary);
        return this.employeeRepository.save(employee);

    }






    public void save (Employee employee) { employeeRepository.save(employee);}

    public Employee get(long id) { return employeeRepository.findById(id).get();}

    public void delete(long id) { employeeRepository.deleteById(id);}






}

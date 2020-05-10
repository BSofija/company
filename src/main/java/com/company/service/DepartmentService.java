package com.company.service;

import com.company.model.Department;
import com.company.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> listAll () {return departmentRepository.findAll();}

    public void save(Department department) {departmentRepository.save(department);}

    public Department get(long id) {return departmentRepository.findById(id).get();}

    public void delete(long id) {departmentRepository.deleteById(id);}
}

package com.company.web.controllers.rest;


import com.company.model.Employee;
import com.company.model.Project;
import com.company.service.EmployeeService;
import com.company.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/rest", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeApi {

    private final EmployeeService employeeService;
    private final ProjectService projectService;

    public EmployeeApi (EmployeeService employeeService, ProjectService projectService) {
        this.employeeService = employeeService;
        this.projectService = projectService;

    }

    @GetMapping("/employees")
    public List<Employee> listAll(){
        return this.employeeService.listAll();
    }

    @GetMapping("/employees/{id}")
    public Employee get(@PathVariable Long id){
        return this.employeeService.get(id);
    }



}

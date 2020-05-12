package com.company.web.controllers.rest;


import com.company.model.Project;
import com.company.service.DepartmentService;
import com.company.service.ProjectService;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/projects", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectApi {

    private final ProjectService projectService;
    private final DepartmentService departmentService;

    public ProjectApi (ProjectService projectService, DepartmentService departmentService) {
        this.projectService = projectService;
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Project> listAll() {
        return this.projectService.listAll();
    }

    @GetMapping("/{id}")
    public Project get(@PathVariable Long id) {return this.projectService.get(id);}
}

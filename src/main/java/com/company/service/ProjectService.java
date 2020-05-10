package com.company.service;


import com.company.model.Project;
import com.company.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> listAll() { return projectRepository.findAll();}

    public void save(Project project) { projectRepository.save(project);}

    public Project get(long id) { return projectRepository.findById(id).get();}

    public void delete(long id) { projectRepository.deleteById(id);}

}

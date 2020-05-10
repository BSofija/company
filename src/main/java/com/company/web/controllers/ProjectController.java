package com.company.web.controllers;

import com.company.model.Project;
import com.company.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/projects")
    public String viewProjectsPage(Model model) {
        List<Project> listProjects = projectService.listAll();
        model.addAttribute("listProjects", listProjects);

        return "projects";
    }



    @RequestMapping("/projects/new")
    public String showNewProjectPage(Model model) {
        Project project = new Project();
        model.addAttribute("project", project);

        return "new_project";
    }

    @RequestMapping(value= "/projects/save", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute("project") Project project) {
        projectService.save(project);

        return "redirect:/projects";
    }

    @RequestMapping("/projects/edit/{id}")
    public ModelAndView showEditProjectPage(@PathVariable(name="id")int id) {
        ModelAndView mav = new ModelAndView("edit_project");
        Project project = projectService.get(id);
        mav.addObject("project", project);

        return mav;
    }

    @RequestMapping("/projects/delete/{id}")
    public String deleteProject(@PathVariable(name="id")int id) {
        projectService.delete(id);
        return "redirect:/projects";
    }


}

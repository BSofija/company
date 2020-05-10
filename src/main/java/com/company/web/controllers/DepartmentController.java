package com.company.web.controllers;

import com.company.model.Department;
import com.company.model.Project;
import com.company.service.DepartmentService;
import com.company.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/departments")
    public String viewDepartmentsPage(Model model) {
        List<Department> listDepartments = departmentService.listAll();
        model.addAttribute("listDepartments", listDepartments);

        return "departments";
    }



    @RequestMapping("/departments/new")
    public String showNewDepartmentPage(Model model) {
        Department department = new Department();
        model.addAttribute("department", department);

        return "new_department";
    }

    @RequestMapping(value= "/departments/save", method = RequestMethod.POST)
    public String saveDepartments(@ModelAttribute("department") Department department) {
        departmentService.save(department);

        return "redirect:/departments";
    }

    @RequestMapping("/departments/edit/{id}")
    public ModelAndView showEditDepartmentPage(@PathVariable(name="id")int id) {
        ModelAndView mav = new ModelAndView("edit_department");
        Department department = departmentService.get(id);
        mav.addObject("department", department);

        return mav;
    }

    @RequestMapping("/departments/delete/{id}")
    public String deleteDepartment(@PathVariable(name="id")int id) {
        departmentService.delete(id);
        return "redirect:/departments";
    }
}

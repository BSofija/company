package com.company.web.controllers;

import com.company.model.Employee;
import com.company.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> listEmployees = employeeService.listAll();
        model.addAttribute("listEmployees", listEmployees);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewEmployeePage (Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "new_employee";
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditEmployeePage(@PathVariable(name="id") int id) {
        ModelAndView mav = new ModelAndView("edit_employee");
        Employee employee = employeeService.get(id);
        mav.addObject("employee", employee);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(name="id") int id) {
        employeeService.delete(id);
        return "redirect:/";
    }








}

package com.spring.pma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pma.dao.iEmployeeRepository;
import com.spring.pma.entity.Employee;
import com.spring.pma.entity.Project;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	iEmployeeRepository empRepo;
	
	@GetMapping("/new")
	public String displayEmployee(Model model) {
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("employees", employees);
		return "./employees/list-employees";
	}
	
	
	@GetMapping("/save")
	public String displayEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "/employee/new-employee";
	}
}

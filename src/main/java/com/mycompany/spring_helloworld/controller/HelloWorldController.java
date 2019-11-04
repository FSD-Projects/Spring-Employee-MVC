package com.mycompany.spring_helloworld.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, HttpServletResponse response, Model model) {
		String empName = request.getParameter("empName");
		String email = request.getParameter("empEmail");
		model.addAttribute("empName", empName);
		model.addAttribute("empEmail", email);
		return "process-form";
	}
}

package com.skt.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("/product")
	public String addProduct(Model model) {
		model.addAttribute("saludo","hola jesus");
		return "addProduct";
	}
	
}

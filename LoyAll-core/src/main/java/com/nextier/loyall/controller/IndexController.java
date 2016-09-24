package com.nextier.loyall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class IndexController {

	@GetMapping
	public String hello(Model model) {

		model.addAttribute("name", "John Doe");
        return "index";
    }

}
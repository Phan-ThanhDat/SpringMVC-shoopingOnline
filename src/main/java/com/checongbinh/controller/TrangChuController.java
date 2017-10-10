package com.checongbinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@GetMapping
	public String Default(ModelMap modelMap){
		modelMap.addAttribute("ten", "Che Cong Binh");
		modelMap.addAttribute("tuoi", 17);
		return "trangchu";
	}
	

	
	
}

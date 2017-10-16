package com.checongbinh.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

import com.checongbinh.entity.DatabaseThoiTrang;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@GetMapping
	public String Default(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		DatabaseThoiTrang databaseThoiTrang = (DatabaseThoiTrang) context.getBean("databasethoitrang");
		
		databaseThoiTrang.getListNhanVien();
		return "trangchu";
	}
	

	
	
}

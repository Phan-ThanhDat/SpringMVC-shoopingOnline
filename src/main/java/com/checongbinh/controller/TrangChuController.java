package com.checongbinh.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.checongbinh.entity.NhanVien;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@Autowired
	SessionFactory sessionFactory;
	
	@GetMapping
	@Transactional
	public String Default(){
		Session session = sessionFactory.getCurrentSession();
		String sql ="from nhanvien";
		List<NhanVien> list =session.createQuery(sql).getResultList();
		
		for (NhanVien nv :list)
		{
			System.out.println("The names of NhanVien:" + nv.getTennhanvien());;
		}
		return "trangchu";
	}
	

	
	
}

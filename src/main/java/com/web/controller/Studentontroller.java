package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Student;
import com.web.repo.StudentRepo;
import com.web.service.StudentService;

@Controller
public class Studentontroller {
	@Autowired 
	private StudentService service;
	
	@Autowired
	private StudentRepo repo;
	
	@RequestMapping("/")
	public String login()
	{
		return "login";
	}
	
//	@RequestMapping("/login")
//	public String loginhome(@RequestParam("email") String email,
//			@RequestParam("psw") String psw,Model model)
//	{
//		Student s=null;
//		
//		try {
//			s=repo.findByEmail(email);
//		}
//		catch(Exception e)
//		{
//			System.out.println("UserNotFound!!!");
//		}
//		if(s!=null)
//		{
//			model.addAttribute("email",email);
//			return "home";
//		}
//		model.addAttribute("error","User Not Found,Kindly register!!!");
//		return "login";
//	}
//	
	
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	
	@RequestMapping("/save")
	public String saveRegister(Student s,Model model)
	{
		Student sd=service.saveStu(s);
		return "msg";
	}
	
//	@RequestMapping("/login")
//	 public String login(@RequestParam("email") String email,
//			@RequestParam("psw") String psw,Student s,Model model)
//	 {
//		Student mail=null;
//		Student pass=null;
//		
//	try{
//		mail=repo.findByEmail(email);
//		pass=repo.findByPsw(psw);
//
//	}
//	catch(Exception e1)
//	{
//		System.out.println("UserNotFound!!!");
//		System.out.println("Passwordnotfound!!!");
//	}
//		
//	if(mail!=null&&pass!=null&&mail.equals(mail)&&pass.equals(pass))
//	{
//		model.addAttribute("email",email);
//		model.addAttribute("psw",psw);
//
//		return "msg";
//	}
//	else if(mail==null)  	 
//	{
//		model.addAttribute("error","User Not Found,Kindly register!!!");
//		
//		return "login";
//	}
//	else if(pass==null)
//	{
//		model.addAttribute("error2","Password Wrong!!!");
//		
//		return "login";
//	}
//	
//
//	
//	return "login";
//
//	 }
//	
//	
	
	
	
	

}

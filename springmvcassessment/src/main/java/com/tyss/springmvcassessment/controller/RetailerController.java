package com.tyss.springmvcassessment.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;


import com.tyss.springmvcassessment.beans.ProductBean;
import com.tyss.springmvcassessment.beans.RetailerBean;
import com.tyss.springmvcassessment.service.RetailerService;

@Controller
public class RetailerController {

	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login page
	
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request,ModelMap map,HttpServletResponse response) {
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			Cookie cookie = new Cookie("name","retailer");
			response.addCookie(cookie);
			return "home";
		}
	}//end of login
	
	
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of register page
	
	    @PostMapping("/register")
		public String register(RetailerBean bean,ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg","You are registered and Id is "+check);
		}else {
			map.addAttribute("msg","Email is repeated");
		}
		
		return "login";
	}//end of register()
	    
	    @GetMapping("/home")
		public String home(ModelMap map,
			  @SessionAttribute(name="bean",required=false) RetailerBean bean) {
			
			if(bean==null) {
				map.addAttribute("msg", "Login First!!!!!!!");
				return "login";
			}else {
				return "home";
			}
		}
		
		@PostMapping("/home")
		public String home() {
		  return "home";	
		}
		
		@GetMapping("/updatepassword")
		public String changePassword(HttpServletRequest request) {
			HttpSession session = request.getSession(false);
			if(session!=null) {
				return "updatepassword"; 
			}else {
				return "login";
			}
			
		}
		@PostMapping("/updatepassword")
		public String changepassword(String password,
				String confirmpassword,
				@SessionAttribute(name="bean")RetailerBean bean,ModelMap map) {
			if(password.equals(confirmpassword)) {
				service.updatePassword(bean.getId(), confirmpassword);
				map.addAttribute("msg","PasswordChanged");
			}else {
				map.addAttribute("msg", "Password Not Matching");
			}
			return "home";
		}
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "login";
		}
		
		@GetMapping("/search")
		public String search(@RequestParam("id")int id,ModelMap map) {
			ProductBean bean = service.searchProduct(id);
			if(bean==null) {
				map.addAttribute("msg", "Data Not Found");
			}else {
				map.addAttribute("bean", bean);
			}
			return "home";	
		}
		
		@GetMapping("/order")
		public String order(HttpServletRequest request) {
			HttpSession session = request.getSession(false);
			if(session!=null) {
				return "order"; 
			}else {
				return "login";
			}
		}
		
		
		
		
		
		
}

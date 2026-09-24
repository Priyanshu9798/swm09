package com.priyanshu.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.priyanshu.dtos.UserDTO;

@Controller
public class ActController{

	@GetMapping("/next")
	public ModelAndView action() {
		ModelAndView mav = new ModelAndView();
		
		UserDTO u1 = new UserDTO("Priyanshu", 23, "SRIT", 95.0f);
		UserDTO u2 = new UserDTO("ankit", 32, "GGIC", 65.0f);
		UserDTO u3 = new UserDTO("shivam", 43, "IPS", 90.0f);
		UserDTO u4 = new UserDTO("ram", 26, "Global", 56.0f);
		UserDTO u5 = new UserDTO("ashish", 53, "RGPV", 45.0f);
		
		List<UserDTO> users = Arrays.asList(u1,u2,u3,u3,u4,u5);
		
		mav.addObject("users",users);
		mav.setViewName("next");
		return mav;
	}
}

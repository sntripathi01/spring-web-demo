package com.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	String html;


	@RequestMapping("/ss")
	public ModelAndView index() {
		ModelAndView mmodelAndView = new ModelAndView();
		mmodelAndView.setViewName("index");
		System.out.println("index");
		return mmodelAndView;
	}
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mmodelAndView = new ModelAndView();
		mmodelAndView.setViewName("home");
		System.out.println("home");
		return mmodelAndView;
	}
	@RequestMapping("/home2")
	public String home1() {
		ModelAndView mmodelAndView = new ModelAndView();
		//mmodelAndView.setViewName("home2");
		System.out.println("home1");
		 return "redirect:jsp/home1.html";
		//return mmodelAndView;
	}
}

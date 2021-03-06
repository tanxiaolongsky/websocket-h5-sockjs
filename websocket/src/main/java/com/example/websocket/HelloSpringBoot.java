package com.example.websocket;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloSpringBoot {
	@RequestMapping(path = { "/helloSpringBoot" })
	public String HelloSpring() {
		return "hello spring boot";
	}

	@RequestMapping(path = { "/index" })
	public ModelAndView index() {
		return new ModelAndView("index");
	}

}
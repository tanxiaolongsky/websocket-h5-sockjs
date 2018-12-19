package com.example.websocketsockjs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
	@RequestMapping(path = { "/index" })
	public ModelAndView index() {
		return new ModelAndView("index");
	}
}


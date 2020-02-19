package com.mvc.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {

	@RequestMapping(value = "/springmvc", method = RequestMethod.GET)
	public String showPage() {
		System.out.println("Inside Spring MVC Page");
		return "springmvc-page";
	}

}

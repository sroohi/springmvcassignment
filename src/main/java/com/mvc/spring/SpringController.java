package com.mvc.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.admin.AdminInfo;
import com.mvc.user.UserInfo;

@Controller
public class SpringController {

	@RequestMapping(value = "/springmvc", method = RequestMethod.GET)
	public ModelAndView showPage() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("springmvc-page");
		mv.addObject("Information", "More infor below:");

		UserInfo ui = new UserInfo();

		ui.setName("BIG Shaawn");
		ui.setEmail("bigsean@bigthing.com");

		mv.addObject("LoggedInUser", ui);

		AdminInfo ai = new AdminInfo();
		ai.setId(5050);
		ai.setName("Very BIG Shawn");
		ai.setIsAuthorized("Is Authorized");

		mv.addObject("Adminstration", ai);

		return mv;

	}

}

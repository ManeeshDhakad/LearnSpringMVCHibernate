package com.maneesh.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class SampleController1 {  
	String message = "Please follow this tutorial project to learn J2EE";
	 
	@RequestMapping("/learnj2ee1")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Study well") String name) {
		 
		ModelAndView mv = new ModelAndView("learnj2ee1");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}  
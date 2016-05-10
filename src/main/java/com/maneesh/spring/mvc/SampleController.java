package com.maneesh.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class SampleController {  
	String message = "I have kept easiest examples to learn J2EE";
	 
	@RequestMapping("/learnj2ee")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Keep it up") String name) {
		 
		ModelAndView mv = new ModelAndView("learnj2ee");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}  
package com.spr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice 
public class Spring {
	
	@InitBinder
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView mk(WebDataBinder binder)
	{
		
		return new ModelAndView();
	}

	@ExceptionHandler(value=RuntimeException.class)
	public String mk()
	{
		 return  "RuntimeException";
	}
}

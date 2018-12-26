package com.mobi;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {
	
	/** GET THE MULTIPLE VAL FORM URL USING @PathVariable **/
	@RequestMapping(value = "/hello/{name}/{nm2}")
	public ModelAndView abc(@PathVariable("name") String name, @PathVariable("nm2") String nm2)
	{ 
		System.out.println("in the controller......");
		ModelAndView model= new ModelAndView("hello");
		model.addObject("msg", "Hello "+name+" "+nm2);
		return model;
	}
	
	/** GET THE MULTIPLE VAL FORM URL USING THE  MAP**/
	@RequestMapping(value = "/hello1/{name}/{nm2}")
	public ModelAndView abc1(@PathVariable Map<String, String> pathsVars)
	{ 
		System.out.println("in the controller......");
		String name = pathsVars.get("name");
		String nm2 = pathsVars.get("nm2");
		ModelAndView model= new ModelAndView("hello");
		model.addObject("msg", "Hello "+name+" "+nm2);
		return model;
	}
	
	/** TO DISPLAY THE FILRST.JSP FILE**/
	@RequestMapping(value = "/abc", method =  RequestMethod.GET)
	public String abc11()
	{ 
		System.out.println("in the controller...");
		/**commended code is for exception handling.**//*
		System.out.println("in the controller......");
		String nullEx = "nullEx";
		
		if (nullEx.equalsIgnoreCase("nullEx"))
			throw new NullPointerException("Null Pointer Exception");*/
		
	
		return "firstJsp";
	}
	
	/***GET THE VAL FORM HTML FORM AND DISPLAY ON THE OTHER VIEW. 
	 * HERE USNG THE @ModelAttribute WE PASS THE WHOLE OBJECT TO ANOTHER VIEW.
	 * WE GET THE STUDENT OBJ. ANY NAME AND USE THAT NAME INTO THE JSP PAGE FOR ACCESSING AND DISPALY THE VAL. ***/ 
	@RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
	public String abc111(@javax.validation.Valid @ModelAttribute ("student1") Student student, BindingResult result)
	{ 
		System.out.println("in the controller......");
		
		//IF THE ANY BINGING REALTED ISSUE.
		if (result.hasErrors())
		{
			return "firstJsp";
		}
		
		/*String name = reqVal.get("name");
		String address = reqVal.get("addr");
		System.out.println(name+" "+address);
		
		model.addAttribute("name", name);
		model.addAttribute("address", address);*/
		return "hello";
	}
	
	/***
	 * THIS IS USED TO CUSTOM BINGING RESULT.
	 * THE ABOVE METHOD NOT CONSIDER THE MOBILE FIELS FOR BINGING.
	 * ***/
	@InitBinder
	public void initBinder(WebDataBinder b)
	{
		//b.setDisallowedFields(new String[] {"mobile"});
	}
	
}

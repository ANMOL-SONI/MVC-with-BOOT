package org.ibm.controller;

import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/empClassMapped")
public class MyCustomController {
	
	@RequestMapping("/homeMethodMapped")
	   public String showHome( ) {
		return "homePage";
	}

	@RequestMapping(value="/saveMethodMapped",method = RequestMethod.POST)
	   public String save( ) {
		return "savePage";
	}
	
	@RequestMapping(value="/displayMethodMapped",method={RequestMethod.GET,RequestMethod.POST})
	   public String display( ) {
		return "displayPage";
	}
	
	@RequestMapping(value="/dispAllMethodMapped",method={GET,POST})
	   public String displayAll( ) {
		return "dispAllPage";
	}
}

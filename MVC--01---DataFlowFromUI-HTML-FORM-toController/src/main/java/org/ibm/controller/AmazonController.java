package org.ibm.controller;

import org.ibm.model.FlashDrive;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //create Object + HTTP
public class AmazonController {

	/**
	* This method is used to show
	* ProductRegister.jsp at browser
	* when they enter URL /reg
	*/
	
	
	//1. Show 'ProductReg.jsp'-/reg(GET)
	@RequestMapping("/reg")
	public String showReg() {
	return "USB_FlashDriveReg";
	}
	
	
	
	/**
	* On click Form Submit, container
	* creates object, same object
	* reading in Controller using
	* @ModelAttribute, this data
	* sending to UI using Model
	* so that form data is displayed
	* at ProductData.jsp page
	*/
	
	
	//2. Read Form Data-/save(POST)
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String readForm(
	@ModelAttribute FlashDrive flashDrive,Model model )
	{
	model.addAttribute("ob", flashDrive);
	return "USB_FlashDriveData";
	}

	}

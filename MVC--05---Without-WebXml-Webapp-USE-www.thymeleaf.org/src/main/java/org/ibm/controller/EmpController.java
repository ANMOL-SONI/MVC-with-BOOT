package org.ibm.controller;

import java.util.ArrayList;
import java.util.List;

import org.ibm.model.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

			@RequestMapping("/data")
			public String readData (
													Model model
											) {
				
			
				//DISPLAY SIMPLE MESSAGE
				model.addAttribute("msg", "Hello BOSS - INTRODUCE YOURSELF --");
				
				//DISPLAY ANY OBJECT
				Emp emp=new Emp();
				
				emp.setEid(100000000);
				emp.setEname("ANMOOOOOL");
				emp.setEsal(777777.999);
				
				model.addAttribute("employee", emp);
				
				//DISPLAY LIST COLLECTION
				List<String> l=new ArrayList<String>();
				
				l.add("Apple");
				l.add("Ball");
				l.add("Cat");
				l.add("Dog");
				l.add("Ear");
				l.add("Fan");
				
				model.addAttribute("list", l);
				
				return "EmpDataPage";
			}
	
}

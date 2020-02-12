package org.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {

			@RequestMapping("/data")
			public String readData (
									
														@RequestParam("eid")int id,
														@RequestParam(value="ename", defaultValue="NONE",required = false)String name,
														@RequestParam(value="esal",required = false)Double sal,
														Model model
														
					) {
				
				System.out.println(id+"  --  "+name+"  --  "+sal);
				
				model.addAttribute("eid", id);
				model.addAttribute("ename", name);
				model.addAttribute("esal", sal);
				
				return "EmpDataPage";
				
			}
	
}

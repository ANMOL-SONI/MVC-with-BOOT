package org.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

			@RequestMapping("/data/{paraId}/{paraName}/{paraSal}")
			public String readData (
																	
													@PathVariable("paraId")Integer id,
													@PathVariable("paraName")String name,
													@PathVariable("paraSal")Double sal,
													Model model
														
					) {
				
				System.out.println(id+"  --  "+name+"  --  "+sal);
				
				model.addAttribute("eid", id);
				model.addAttribute("ename", name);
				model.addAttribute("esal", sal);
				
				return "EmpDataPage";
//	   						http://localhost:2020/MVC--03---RequestParam/data/651645/ANMOL_SONI/65416.65416
			}
	
}

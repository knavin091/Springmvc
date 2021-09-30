package org.btm.spingMvcApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class DemoController {
	
	public DemoController() {

		System.out.println("DemoController object created");
	}
	@RequestMapping(value ="btm",method = RequestMethod.POST)
	public ModelAndView display(@ModelAttribute Demo demo) {
		System.out.println("Inside display()");
		
		String msg="Diplaying Message="+demo.getNm();
		return new ModelAndView("Sucess","any",msg);

		
	}
	@RequestMapping(value ="btm1",method = RequestMethod.POST)
	public String displayNew(@ModelAttribute Demo demo,ModelMap map) {
		System.out.println("Inside displayNew()");
		
		String msg="Diplaying new Message="+demo.getNm();
		map.addAttribute("any",msg);
		return "Sucess";

		
	}
}


package de.anugular2.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping("/page1")
    public ModelAndView getPage1() {
        return new ModelAndView("page1");
    }
	
	@RequestMapping("/page2")
    public ModelAndView getPage2() {
        return new ModelAndView("page2");
    }
	
	@RequestMapping(value={"/angular2/param3-{param3}/main/**"})
    public ModelAndView getAngular2Page(@RequestParam(required=false) final String param1, 
    									@RequestParam(required=false) final String param2,
    									@PathVariable final String param3) {
		
		final ModelAndView mv = new ModelAndView("angular2page");
		
		mv.addObject("param1", param1);
		mv.addObject("param2", param2);
		mv.addObject("param3", param3);
        return mv;
    }
	
}

package de.anugular2.spring.controller;

import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/angular2page")
    public ModelAndView getAngular2Page() {
        return new ModelAndView("angular2page");
    }
	
}

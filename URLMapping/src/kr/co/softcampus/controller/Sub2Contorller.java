package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub2")
public class Sub2Contorller {
	
	@RequestMapping(value ="/test5", method = RequestMethod.GET)
	public String test5() {
		return "sub2/test6";
	}
	
	@RequestMapping(value ="/test6", method = RequestMethod.GET)
	public String test6() {
		return "sub2/test6";
	}
}

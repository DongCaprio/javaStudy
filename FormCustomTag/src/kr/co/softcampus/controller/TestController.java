package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.co.softcampus.beans.UserDataBean;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(UserDataBean bean) { // @ModelAttribute 생략한거임 !!! 앞으로도 생략할것
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("주소1번입니다");
		bean.setUser_address2("주소2번입니다");
		return "test1";
	}

	@GetMapping("/test2")
	public String test2(UserDataBean bean) {
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("주소1번입니다");
		bean.setUser_address2("주소2번입니다");

		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute("testBean")UserDataBean bean) {
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("주소1번입니다");
		bean.setUser_address2("주소2번입니다");

		return "test3";
	}
	
	@GetMapping("/test4")
	public String test3(Model model) {
		UserDataBean bean = new UserDataBean();
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("주소1번입니다");
		bean.setUser_address2("주소2번입니다");
		
		model.addAttribute("test_user4",bean);
		return "test4";
	}
	
}

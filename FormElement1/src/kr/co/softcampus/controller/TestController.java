package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean) { // @ModelAttribute 생략 , test1.jsp사용시 클래스이름에 맨앞소문자인 dataBean으로 사용함
		bean.setA1("data1");
		bean.setA2("data2");
		bean.setA3("data3");
		bean.setA4("data4");
		return "test1";
	}
}

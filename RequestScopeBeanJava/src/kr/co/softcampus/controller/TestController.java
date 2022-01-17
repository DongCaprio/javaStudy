package kr.co.softcampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {
	
	@Autowired
	DataBean1 requestBean1;
	
	@GetMapping("/test1")
	public String test1() {
		
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		
		return "forward:/result1"; //forward을 통한것은 새로운 요청이 아니기 때문에 새로운 객체가 만들어지지 않고 위의 requestBean1을 그대로 사용함
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		System.out.println("requestBean1.data1 : "+requestBean1.getData1());
		System.out.println("requestBean1.data2 : "+requestBean1.getData2());
		
		model.addAttribute("requestBean1", requestBean1); //이게 없으면 프린트ln에는 출력되지만 화면에는 출력이 안됨!
		
		return "result1";
	}
}

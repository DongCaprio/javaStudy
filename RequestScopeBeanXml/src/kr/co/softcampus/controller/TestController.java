package kr.co.softcampus.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.DataBean3;
import kr.co.softcampus.beans.DataBean4;

@Controller
public class TestController {
	
	@Autowired
	@Lazy
	DataBean1 requestBean1;
	
	@Resource(name = "requestBean2")
	@Lazy
	DataBean2 requestBean2;
	
	@Autowired
	@Lazy
	DataBean3 requestBean3;
	
	@Resource(name = "requestBean4")
	@Lazy
	DataBean4 requestBean4;
	
	@GetMapping("/test1")
	public String test1() {
		
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		
		requestBean2.setData3("문자열3");
		requestBean2.setData4("문자열4");
		
		requestBean3.setData5("문자열5");
		requestBean3.setData6("문자열6");

		requestBean4.setData7("문자열7");
		requestBean4.setData8("문자열8");
		
		return "forward:/result1"; //forward을 통한것은 새로운 요청이 아니기 때문에 새로운 객체가 만들어지지 않고 위의 requestBean1을 그대로 사용함
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		System.out.println("requestBean1.data1 : "+requestBean1.getData1());
		System.out.println("requestBean1.data2 : "+requestBean1.getData2());
		
		System.out.println("requestBean2.data1 : "+requestBean2.getData3()); //requestBean2는 java와는 다르게 model에다가 저장안함 근데도 화면출력이 된다!(xml과 어노테이션의 차이)
		System.out.println("requestBean2.data2 : "+requestBean2.getData4());
		
		System.out.println("requestBean3.data5 : "+requestBean3.getData5());
		System.out.println("requestBean3.data6 : "+requestBean3.getData6());
		
		System.out.println("requestBean4.data7 : "+requestBean4.getData7());
		System.out.println("requestBean4.data8 : "+requestBean4.getData8());
		
		model.addAttribute("requestBean1", requestBean1); //이게 없으면 프린트ln에는 출력되지만 화면에는 출력이 안됨!
		//2가 없는 이유는 2는 없어도 정상작동함
		model.addAttribute("requestBean3", requestBean3);
		model.addAttribute("requestBean4", requestBean4);
		
		return "result1";
	}
}

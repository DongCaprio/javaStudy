package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcampus.beans.DataBean;

//커멘드객체를 사용해서 정보전달

@Controller
public class TestController {
	@PostMapping("/test1") 
  //public String test1(@ModelAttribute DataBean bean) { // 내가 만든 객체 주입@ModelAttribute / Setter로 값 세팅 , 출력시에는 getter로 값 얻어오기
	public String test1(DataBean bean) { // @ModelAttribute는 생략가능 (위에줄과 동일한 의미를 가짐)
		System.out.printf("data1 : %s\n", bean.getData1()); //getter
		System.out.printf("data2 : %s\n", bean.getData2());
		return "test1";
	}
	
	@PostMapping("test2")
	public String test2(@ModelAttribute("testData")DataBean bean) { //이렇게 @ModelAttribute("내가지정한이름")을 하면 JSP 에서 내가 지정한 이름으로 ${}사용가능 (원래 해야하는 첫번째 대문자 법칙은 이경우 안지켜도된다 내가정한이름이므로)
		
		return "test2";
	}
	
}

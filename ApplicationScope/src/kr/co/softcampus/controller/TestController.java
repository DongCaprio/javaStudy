package kr.co.softcampus.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {
	
	//ApplicationScope는 따로 어노테이션이 없고
	//보통 ServletContext객체를 @Autowired해서 사용하고
	//model같은것 없이 바로 jsp에서 사용가능하다
	@Autowired
	ServletContext application;
	
	@GetMapping("/test1")
//	public String test1(HttpServletRequest request) {
	public String test1(){
		//ServletContext application = request.getServletContext();
		//서블릿컨텍스트에 저장을 해주면 브라우져에 상관없이 똑같은 메모리공간을 사용하게됨
		application.setAttribute("data1", "문자열1");
		
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("data1");
		bean1.setData2("data2");
		application.setAttribute("bean1", bean1);
		return "test1";
	}

	@GetMapping("/result1")
//	public String result1(HttpServletRequest request) {
	public String result1() {
//		ServletContext application = request.getServletContext();
//		String data1 = (String)application.getAttribute("data1");
//		System.out.println("data1 : "+data1);
		
		DataBean1 bean1 = (DataBean1)application.getAttribute("bean1");
		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
		return "result1";
	}
	
}

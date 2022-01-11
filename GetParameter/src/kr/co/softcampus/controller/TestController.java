package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {

		String data1 = request.getParameter("data1");
		// 파라미터는 무조건 문자열로 추출된다
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);

		for (String str1 : data3) {
			System.out.println("data3 : " + str1);
		}

		System.out.println("-----------------");
		return "result";
	}

	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3"); // 체크박스는 아무것도 체크안하면 null값이 들어가서 에러발생함

		System.out.println(data1);
		System.out.println(data2);

		if (data3 != null) { // if문 넣는 이유가 체크박스 체크를 안하면 null이 되어서 에러발생하기 때문
			for (String str1 : data3) {
				System.out.println("data3 : " + str1);
			}
		}
		System.out.println("-----------------");
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		for(String str1 : data3) {
			System.out.println("data3 : " +str1);
		}
		return "result";
	}
	
	@GetMapping("test4/{data1}/{data2}/{data3}")
	public String str4(@PathVariable String data1,
					   @PathVariable String data2,
					   @PathVariable String data3) {
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		
		return "result";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package kr.co.softcampus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PropertySource("/WEB-INF/properties/data1.properties") //한개 사용시 @PropertySource, 2개이상은 @PropertySources
 //@PropertySource와 사용한 클래스는 클래스의 내용에서 @Value("${ ~ }") 태그와 함께 사용한다.
public class TestControlloer {
	
	@Value("${aaa.a1}")
	private int a1; //숫자는 int, string 중 정할 수 있다.
	
	@Value("${aaa.a2}")
	private String a2; 
	
	@Value("${bbb.b1}")
	private int b1;

	@Value("${bbb.b2}")
	private String b2;
	
	@GetMapping("/test1")
	public String test1() {
		
		System.out.println("aaa.a1 : "+a1);
		System.out.println("aaa.a2 : "+a2);
		System.out.println("aaa.b1 : "+b1);
		System.out.println("aaa.b2 : "+b2);
		return "test1";
	}
}

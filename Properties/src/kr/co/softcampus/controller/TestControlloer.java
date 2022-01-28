package kr.co.softcampus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@PropertySource("/WEB-INF/properties/data1.properties") //한개 사용시 @PropertySource, 2개이상은 @PropertySources
//@PropertySource("/WEB-INF/properties/data2.properties")
/*
 * @PropertySource(value = { "/WEB-INF/properties/data1.properties",      
 * "/WEB-INF/properties/data2.properties" })
 */
@PropertySources({
	@PropertySource("/WEB-INF/properties/data1.properties"),
	@PropertySource("/WEB-INF/properties/data2.properties")
})
/*
위에 보면 크게 properties파일을 저장하는 방법이 3가지이다. 
   1번째 : 그냥 @PropertySource로 다 쓰기 
   2번째: @PropertySource쓰고 value를 배열로 주기 
   3번째 : @PropertySources를 사용한 후 그 안에 배열로 @PropertySource넣기 
   3번째가 가장 좋은 것 같다(물론 3가지는 properties파일 여러개 사용시이고 
   한개만 사용시에는 그냥 @PropertySource만 쓰면된다)
 */
public class TestControlloer {
	//@PropertySource와 사용한 클래스는 클래스의 내용에서 @Value("${ ~ }") 태그와 함께 사용한다.	
	@Value("${aaa.a1}")
	private int a1; //숫자는 int, string 중 정할 수 있다.
	
	@Value("${aaa.a2}")
	private String a2; 
	
	@Value("${bbb.b1}")
	private int b1;

	@Value("${bbb.b2}")
	private String b2;
	
	@Value("${ccc.c1}")
	private String c1;
	
	@Value("${ccc.c2}")
	private String c2;

	@Value("${ddd.d1}")
	private String d1;

	@Value("${ddd.d2}")
	private String d2;
	
	@GetMapping("/test1")
	public String test1() {
		System.out.println("aaa.a1 : "+a1);
		System.out.println("aaa.a2 : "+a2);
		System.out.println("bbb.b1 : "+b1);
		System.out.println("bbb.b2 : "+b2);
		System.out.println("ccc.c1 : "+c1);
		System.out.println("ccc.c2 : "+c2);
		System.out.println("ddd.d1 : "+d1);
		System.out.println("ddd.d2 : "+d2);
		return "test1";
	}
}

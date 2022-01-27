package kr.co.softcampus.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	//서버에서 쿠키를 저장하는건 아님(쿠키는 String만 가능하고 encoding decoding 필수!!)
	@GetMapping("/save_cookie") //파라미터에 넣은것은 reqeust아니고 response임!!
	public String save_cookie(HttpServletResponse response) {
		try {
			String data1 = URLEncoder.encode("문자열1","UTF-8"); //한글 들어가면 무조건 인코딩해야된다
			String data2 = URLEncoder.encode("문자열2","UTF-8");
			
			Cookie cookie1 = new Cookie("cookie1", data1);
			Cookie cookie2 = new Cookie("cookie2", data2);
			
			cookie1.setMaxAge(365 * 24 *60 * 60); //초단위로 적는다
			cookie2.setMaxAge(365 * 24 *60 * 60);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return "save_cookie";
	}
	
	@GetMapping("/load_cookie") //원래 jsp에서 쓰는방식 하나하나 모든 쿠키를 확인해야되므로 번거롭다
								//스프링에서 하는방식은 밑에 load_cookie2에서 살펴보자
	public String load_cookie(HttpServletRequest request) {
		//쿠키정보는 좋든싫든 쓰든안쓰든 무조건 브라우져는 서버로 쿠키정보를 보내준다.
		//우리는 그것을 받아다 쓰기만 하면된다(spring을 쓸때와 안쓸떄 쿠키처리 방법이 다를뿐)
		try {
			Cookie[] cookies = request.getCookies(); //쿠키를 원하는것 몇개만쓰고싶어도 모든 쿠키가 날아오니 다 선별해서 사용해야한다(그러니 배열로받음)
			for(Cookie cookie : cookies) {
				String str = URLDecoder.decode(cookie.getValue(), "UTF-8");
				//인코딩 디코딩 전부 다해주어야한다.
				if(cookie.getName().equals("cookie1")) {
					System.out.println("cookie1 : "+str);
				} else if (cookie.getName().equals("cookie2")) {
					System.out.println("cookie2 : "+str);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "load_cookie";
	}
	
	@GetMapping("load_cookie2") //*****spring cookie방식****** 위에꺼보다 간편
	public String load_cookie2(@CookieValue("cookie1")String cookie1,
								@CookieValue("cookie2")String cookie2) { 
		//스프링에서는 파라미터로 쿠키받을수있음!! *인코딩*도 자동으로된다
		//jsp방식과는 다르게 원하는 쿠키만을 뽑아올수 있고, 쿠키이름을 통해 뽑아올수 있다.
		System.out.println("cookie1 : "+cookie1);
		System.out.println("cookie2 : "+cookie2);
		return "load_cookie2";
	}
	
}

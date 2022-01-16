package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController { //Redirect : 클라이언트에게 새로운 페이지 요청을 응답결과로 전달
							  //Forward : 서버상에서 코드의 흐름이 이동됨(url은 원래대로임!)
	@GetMapping("/test1")
	public String test1() {
		
		return "redirect:sub1";
	}
	
	@GetMapping("sub1")
	public String sub1() {
		return "sub1";
	}
	
	@GetMapping("test2")
	public String test2() {
		return "forward:sub2"; //이렇게 하면 주소값은 안바뀌는데 출력은 sub2를 해준다(url은 test2로 표시됨)
	}
	
	@GetMapping("/sub2")
	public String sub2() {
		return "sub2";
	}
}

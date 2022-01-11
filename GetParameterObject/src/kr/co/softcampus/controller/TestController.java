package kr.co.softcampus.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String,String> map) {
			String data1 = map.get("data1");
			String data2 = map.get("data2");
			
			System.out.printf("data1 : %s\n", data1);
			System.out.printf("data2 : %s\n", data2);
		return "result";
		//7분부터 영상 다시보기
	}
}

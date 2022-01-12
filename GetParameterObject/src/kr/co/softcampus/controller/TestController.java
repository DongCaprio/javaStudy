package kr.co.softcampus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.DataBean2;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String,String> map, @RequestParam List<String> data3) { // data3은 데이터가 여러개 날아옴
			String data1 = map.get("data1");													//데이터 여러개인 경우는 List<String>으로 받음 //중요*** (숫자도)int로 못받음!! 넘어오는값은 무조건! String으로 받는다
			String data2 = map.get("data2");
			String data33 = map.get("data3"); //data는 실제 2개 날아오는데 map.get으로는 1개받게 못받음(데이터 여러개 날아올때 이렇게 하면안됨)
			
			System.out.printf("data1 : %s\n", data1);
			System.out.printf("data2 : %s\n", data2);
			System.out.printf("data33 : %s\n", data33);
			
			for(String str : data3) {
				System.out.printf("data3 : %s\n",str);
			}
		return "result";
	}
	
	@GetMapping("/test2")
	//public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 dataBean2) { ★★★★★★★★★★★★★★★★★★★★
	public String test2(DataBean bean1, DataBean2 dataBean2) { //*******중요****** @ModelAttribute는(객체주입어노테이션) 생략 가능 (위에줄과 효과 동일!!) --> 이런것을 "커멘드 객체"라고 부름 
		System.out.printf("data1 : %d\n", bean1.getData1());   // ******* Map과 List 보다는 이렇게 Bean을 정의해서 주입받는것을 더욱 선호(객체주입) *************
		System.out.printf("data2 : %d\n", bean1.getData2());
		
		for(int number1 : bean1.getData3()) {
			System.out.printf("data3 : %d\n", number1);
		}
		
		System.out.printf("bean1 : %d\n", dataBean2.getData1());
		System.out.printf("bean2 : %d\n", dataBean2.getData2());
		
		return "result";
	}
	
	
	
	
	
}

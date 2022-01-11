package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//중요!!!!!!!!!
	// 위의 방식보다 Rest API인 이 방식을 많이 사용함
	@GetMapping("test4/{data1}/{data2}/{data3}") //RestAPI 방식 @PathVariable이면 {}안에 있는 값과 매핑된다 (형변환도 알아서 해준다)
	public String test4(@PathVariable String data1, //예를 들어 <- int data1이었다면 들어온 값은 자동으로 int로 형변환된다
					   @PathVariable String data2,
					   @PathVariable String data3) {
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		
		return "result";
	}
	
	// @RequestParam 을 사용해서 파라미터 받는곳에서 바로 받아서 사용
	//	Rest API 가 아니라면 이 방식을 많이 사용
	// 대신 @RequestParam 사용하려면 보내는 정보의 이름과 밑에 data1 등 이름이 동일해야한다
	@GetMapping("test5")
	public String test5(@RequestParam int data1,
						@RequestParam int data2,
						@RequestParam int[] data3) {
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		for(int i : data3) {
			System.out.println("data3 : "+i);
		}
		return "result";
	}
	
	//위의 @RequestParam 과 동일한데
	// 이거는 파라미터의 이름을 동일하게 맞추지 않을때 사용
	//사실 그냥 맞추고 위에것처럼 사용하는것을 더 선호함
	@GetMapping("test6")
	public String test6(@RequestParam(value="data1") int value1,
						@RequestParam(value="data2") int value2,
						@RequestParam(value="data3") int[] value3 ) {
		System.out.println("data1 : "+value1);
		System.out.println("data2 : "+value2);
		for(int i : value3) {
			System.out.println("data3 : "+i);
		}
		return "result";
	}
	
	//data1만 값이 있음 나머지는 없는경우
	//data2는 없는경우 그냥 하면 에러가 뜸
	//required = false 이면 에러가 안나고 null값이 들어가게 된다
	@GetMapping("test7")
	public String test7(@RequestParam int data1, 
						@RequestParam(required = false) String data2,//(required = false)가 있으면 값 없을때 에러가 안나고 null값이 들어감 그러므로 String이면 null이라 진행되는데 int는 null이 못들어가므로 오류가 다시뜸 헷갈림주의!!
						@RequestParam(defaultValue = "555") int data3) {  // defalutValue는 String으로 들어오고 값 없을때 말그대로 기본값을 설정해줌(null이 아닌 내가 지정한값)
		System.out.println("data1 : "+data1);							//그리고 int data3으로 한다면 String이 int로 형변환되어서 들어온다                          
		System.out.println("data2 : "+data2); //data2는 없는경우
		System.out.println("data3 : "+data3); 
		return "result";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

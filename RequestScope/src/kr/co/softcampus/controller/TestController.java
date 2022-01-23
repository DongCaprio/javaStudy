package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softcampus.beans.DataBean1;


//가장 중요한것은 주입할때는 Model, request, ModelAndView 다 가능하지만
//추출하는 곳에서는 무조건 HttpServletRequest request객체를 이용해서
//출력을 진행해야지만 정상적으로 출력이 진행된다
//ex) model로 주입후 model로 출력시에는 새로운 model객체로 받아들여서 정상적으로 출력이 이루어지지않는다
@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("data1", "문자열1");
		return "forward:result1"; //Redirect:result1을 쓰면 위에 설정해준 data1이 null로 나옴(즉 redirect는 request유지안됨! but Forward는 request정보 유지됨)
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		
//		String data1 = (String)request.getAttribute("data1");
//		System.out.println("data1 : "+data1);
		
		return "result1";
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("data2","문자열2"); //저장은 request영역에 저장됨, 즉 받는 GetMapping의 파라미터는 Model이 아닌 Request로 해야함 
		return "forward:result2";
	}
	
	@GetMapping("/result2")
	public String result2(HttpServletRequest request) { //여기서 파라미터에 Model을 주입받으면 밑에줄의 syso에 data2:null이라고뜸
		//String data2 = (String)model.getAttribute("data2"); //model은 forward해도 유지가 되지않음!!! 유지가 되는것은 Request
		String data2 = (String)request.getAttribute("data2"); 
		System.out.println("data2 : "+data2);
		return "result2";
	}
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mv) {
		
		mv.addObject("data3", "문자열3");
		mv.setViewName("forward:result3");
		return mv;
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		
		String data3 = (String)request.getAttribute("data3");
		System.out.printf("data3 : %s\n", data3);
		return "result3";
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자열4");
		bean1.setData2("문자열5");
		
		model.addAttribute("bean1", bean1);
		return "forward:result4";
	}
	
	@GetMapping("result4")
	public String result4(HttpServletRequest request) {
		DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");
		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
		
		return "result4";
	}
	
	@GetMapping("/test5")
	public String test5(@ModelAttribute("bean1") DataBean1 bean1) {
		bean1.setData1("문자열6");
		bean1.setData2("문자열7");
		return "forward:result5";
	}
	
	@GetMapping("/result5")
//	public String result5(@ModelAttribute("bean1") DataBean1 bean1) { //Model로 받은값은 forward할때는 유지가 안되서 request로 받아야함!!!!!!
	public String result5(HttpServletRequest request) {
//		DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");  여기서부터 밑에 3줄은 다됌 주석을 한 까닭은
//		System.out.println("bean1.data1 : "+bean1.getData1());       이렇게 아무것도 없어도 result5.jsp에서 ${bean1.data1}것을 출력할 수 있기 때문
//		System.out.println("bean1.data2 : "+bean1.getData2());
		return "result5";
	}
	
	
	
	
	
	
	
	
	
	
}

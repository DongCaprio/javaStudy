package kr.co.softcampus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.softcampus.beans.DataBean1;

@Controller
@SessionAttributes({"sessionBean1","sessionBean2"}) //sessionBean1은 Request영역이 아닌 session영역에 지정해줘!라는뜻 (test5 result5에서 사용할것)
public class TestController {
	// 세션영역은 새로운 요청이 발생해도 그 공간이 유지됨(브라우져 꺼질때까지)
	
	
	//위에@SessionAttributes가 작동을하면 똑같은 메소드명을 찾고  리턴값을 "sessionBean1"에 주입한다
	@ModelAttribute("sessionBean1")
	public DataBean1 sessionBean1() {
		return new DataBean1();
	}
	
	@ModelAttribute("sessionBean2")
	public DataBean1 sessionBean2() {
		return new DataBean1();
	}

	@GetMapping("/test1")
//	public String test1(HttpServletRequest request) {
	public String test1(HttpSession session) {
//		HttpSession session = request.getSession(); //이렇게 하는건 JSP에서함(Spring에서는 바로 파라미터에 세션받기 가능)
		session.setAttribute("data1", "문자열1");
		return "test1";
	}

	@GetMapping("/test2")
	public String test2(HttpSession session) {
		session.setAttribute("data1", "문자열2");
		return "redirect:/result1";
	}

	@GetMapping("/test3")
	public String test3(HttpSession session) {
		session.setAttribute("data1", "문자열3");
		return "forward:/result1";
	}

	@GetMapping("/result1")
	// public String result1(HttpServletRequest request) { 세션객체를 바로 주입받을수도
	// 있음(Spring에서 가능한것)
	public String result1(HttpSession session) {
//		HttpSession session = request.getSession();
		String data1 = (String) session.getAttribute("data1");
		System.out.println("data1 : " + data1);

		return "result1";
	}

	@GetMapping("/test4")
	public String test4(HttpSession session) {
//	public String test4(@SessionAttribute("bean1")DataBean1 bean1) { 이렇게는 사용불가
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자열4");
		bean1.setData2("문자열5");
		session.setAttribute("bean1", bean1);
		return "test4";
	}
	
	@GetMapping("/result4")
//	public String result4(HttpSession session) {
	public String result4(@SessionAttribute("bean1")DataBean1 bean1) {
//		DataBean1 bean1 = (DataBean1)session.getAttribute("bean1"); //이렇게 안하고 @SessionAttribute로 바로 Bean을 주입받을수도 있다
		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
		
		return "result4";
	}
	
	@GetMapping("/test5")
	public String test5(@ModelAttribute("sessionBean1")DataBean1 sessionBean1,
						@ModelAttribute("sessionBean2")DataBean1 sessionBean2) {
		
		sessionBean1.setData1("문자열6");
		sessionBean1.setData2("문자열7");
		
		sessionBean2.setData1("문자열8");
		sessionBean2.setData2("문자열9");
		
		return "test5";
	}
	
	@GetMapping("/result5")
	public String result5(@ModelAttribute("sessionBean1")DataBean1 sessionBean1,
						  @ModelAttribute("sessionBean2")DataBean1 sessionBean2) {
		
		System.out.println("sessionBean1.data1 : "+sessionBean1.getData1());
		System.out.println("sessionBean1.data2 : "+sessionBean1.getData2());

		System.out.println("sessionBean2.data1 : "+sessionBean2.getData1());
		System.out.println("sessionBean2.data2 : "+sessionBean2.getData2());
		
		return "result5";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

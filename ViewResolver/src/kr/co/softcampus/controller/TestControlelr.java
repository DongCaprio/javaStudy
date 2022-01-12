package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestControlelr { //4개의 방식으로 정보전달 가능
	@GetMapping("/test1")
	public String test1() {  //파라미터로 정보를 넘기는 경우 test1.jsp에서 ${param. } 으로 출력이 가능하다
		return "test1";
	}

	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {

		request.setAttribute("data1", 100);//HttpServletRequest로 정보전달 방식, jsp에서 ${data1}로 출력가능
		request.setAttribute("data2", 200);
		return "test2";
	}

	@GetMapping("/test3")
	public String test3(Model model) {   //Model을 이용한 정보전달(4개 다 비슷하지만 이게 가장 편한듯?)

		model.addAttribute("data1", 300); //model을 통해서 정보를 전달하고 jsp에서 ${data1}로 출력 가능
		model.addAttribute("data2", 400);
		return "test3";
	}
	
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) { //ModelAndView방식 리턴값이 ModelAndView이고 파라미터에서 객체를 만들어 사용
		mv.addObject("data1", 500); //만들어논 객체어 data1을 삽입
		mv.addObject("data2", 600);
		
		mv.setViewName("test4"); //setViewName 메소드를 사용해서 view의 이름을 정해주고 
		return mv;       		 // 객체를 리턴해준다
	}
}

package kr.co.softcampus.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softcampus.beans.DataBean;

@RestController
public class RestTestController {
	
	@GetMapping("/test2")
	public ResponseEntity<ArrayList<DataBean>> test2() {
		//바로위 리턴의 형태를 잘 맞춰주도록 하자
		
		DataBean bean1 = new DataBean("문자열1", 100, 11.11, false);
		DataBean bean2 = new DataBean("문자열2", 200, 22.22, true);
		DataBean bean3 = new DataBean("문자열3", 300, 33.33, false);
		
		ArrayList<DataBean> list = new ArrayList<DataBean>();
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
 
		//json객체로 만들기 위한 코드
		ResponseEntity<ArrayList<DataBean>> entry = 
				new ResponseEntity<ArrayList<DataBean>>(list, HttpStatus.OK);
		//브라우저에게 보낼 응답결과가 정상적인 데이터라고 알려주는것이 HttpStatus.OK이다.
		//json데이터를 구성할 객체를 파라미터의 ,앞부분인 (여기서는 list)에 넣어주면 된다.
		return entry;
	}
}

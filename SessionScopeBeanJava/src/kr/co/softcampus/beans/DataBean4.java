package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component(value = "sessionBean4")
@SessionScope
public class DataBean4 {
	private String data7;
	private String data8;
	
	public String getData7() {
		return data7;
	}
	public void setData7(String data7) {
		this.data7 = data7;
	}
	public String getData8() {
		return data8;
	}
	public void setData8(String data8) {
		this.data8 = data8;
	}
	/*
	 * 이것을 스캔시키기 위해서는 config패키지의 ServletAppContext.java로 가서
	 * @ComponentScan에 패키지를 추가시켜주어야한다!!!!
	 * 그래야지 @Autowired로 사용할 수 있다.
	 */
}

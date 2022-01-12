package kr.co.softcampus.beans;

//내가 직접 Controller에 @ModelAttribute로 주입할 객체를 만듬  ++ setter getter 는 필수!!!!!!!!!!
public class DataBean {
	private String data1; /*****String "이름" 에서 이름은 jsp에서의 name과 동일하게 해야한다*************/
	private String data2; /********** int로 하고싶으면 int로 하면 알아서 형변환이 된다  */
	
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	
	
}

package kr.co.softcampus.beans;
//커멘드 객체(Controller 객체주입)     Getter/setter 필수
public class DataBean {
	
	private int data1;
	private int data2;
	private int[] data3; // data가 2개 이상 날아올때는 배열로 정의
	private int data100;
	
	public int getData100() {
		return data100;
	}
	public void setData100(int data100) {
		this.data100 = data100;
	}
	public DataBean() {
		// TODO Auto-generated constructor stub
	}
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	public int[] getData3() {
		return data3;
	}
	public void setData3(int[] data3) {
		this.data3 = data3;
	}
	
}

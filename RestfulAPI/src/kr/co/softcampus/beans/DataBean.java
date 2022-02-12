package kr.co.softcampus.beans;

public class DataBean {
	
	private String data1;
	private int date2;
	private double data3;
	private boolean data4;
	
	public DataBean(String data1, int date2, double data3, boolean data4) {
		this.data1 = data1;
		this.date2 = date2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public int getDate2() {
		return date2;
	}
	public void setDate2(int date2) {
		this.date2 = date2;
	}
	public double getData3() {
		return data3;
	}
	public void setData3(double data3) {
		this.data3 = data3;
	}
	public boolean isData4() {
		return data4;
	}
	public void setData4(boolean data4) {
		this.data4 = data4;
	}
}

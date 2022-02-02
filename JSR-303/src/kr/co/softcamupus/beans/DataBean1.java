package kr.co.softcamupus.beans;

import javax.validation.constraints.AssertTrue;

public class DataBean1 {
	
	@AssertTrue
	private boolean data1;

	public boolean isData1() {
		return data1;
	}

	public void setData1(boolean data1) {
		this.data1 = data1;
	}
	
	
	
}

package edu.ssafy;

import java.io.Serializable;

public class Employee implements Serializable{
	public int num;
	protected int worktime;
	protected int addtime;
	
	public Employee(int num) {
		this.num = num;
		worktime =8;
	}

	public String whoami() {
		return "근로자";
	}

	public String work() {
		return "근로자가 "+worktime+"시간동안일을 합니다";
	}

}

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
		return "�ٷ���";
	}

	public String work() {
		return "�ٷ��ڰ� "+worktime+"�ð��������� �մϴ�";
	}

}

package edu.ssafy;

public class Salesman extends Employee{
	public Salesman(int num) {
		super(num);
		this.addtime=5;
		this.worktime=super.worktime+this.addtime;
	}
	@Override
	public String whoami() {
		return "�������";
	}
	@Override
	public String work() {
	
		return "��������� : "+this.worktime+" ���� �մϴ�.";
	}

}

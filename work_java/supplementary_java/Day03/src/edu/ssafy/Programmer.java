package edu.ssafy;

public class Programmer extends Employee{
	public Programmer(int num) {
		super(num);
		this.addtime= 3;
		this.worktime= super.worktime+this.addtime;
	}
	@Override
	public String whoami() {
		// TODO Auto-generated method stub
		return "������";
	}
	@Override
	public String work() {
		return "�����ڰ�"+worktime+"�ð����� ���� �մϴ�.";
	}
	public void goodIdea() {
		this.worktime--;
	}

}

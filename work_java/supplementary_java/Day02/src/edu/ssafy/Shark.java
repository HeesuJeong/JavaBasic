package edu.ssafy;

public class Shark extends Animal{
	//private String type = "���";
	//private String food;
	{
		this.type="���";
	}
	
	public Shark() {
		this.type="���";
		// TODO Auto-generated constructor stub
	}
	public Shark(String food) {
		this.type="���";
		this.food = food;
	}
	
	//������
	public void eat() {
		//String meal;
		/*���������� ��������� ������ 
		*��������� ����Ʈ �ʱ�ȭ�� �Ͼ 
		���������� �ʱ�ȭ ���� ������ ����
		*/
		//System.out.println(this.type+"��" +meal+"�� �Խ��ϴ�.");
			
		System.out.println(this.type+"��" +food+"�� �Խ��ϴ�.");
	}
	public void swim() {
		System.out.println(this.type+"�� ������ �մϴ�.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type;
	}

}

package edu.ssafy;

/*
 *����Ÿ�� �ϼ��� �Ϲ�ȭ 
 *����Ÿ���ϼ��� ��üȭ
 *
 */
public class Animal {
	protected String type="����";

	protected String food;

	//������ ������ �޼ҵ� �����ڴ� ������ ����...!
	public Animal() {

	}
	
	public Animal(String food) {

		this.food = food;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void eat() {
		System.out.println(this.type+"��" +food+"�� �Խ��ϴ�.");
	}
	//
	@Override
	public String toString() {
		
		return this.type;
	}
}

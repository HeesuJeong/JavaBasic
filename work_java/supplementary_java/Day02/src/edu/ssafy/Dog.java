package edu.ssafy;

public class Dog extends Animal{
	private String type = "������";
	private String food;
	private static Dog d = new Dog();
	
	/**
	public Dog getInstance() {
		return d;
	}
	*/
	//static���� �ϸ� ��ü�� ������ �ʰ� ���� �� �� �־ 
	//static ������ this�� super�� ���� �� ���� 
	public static Dog getInstance(String food) {
		d.food=food;
		return d;
	}
	public static Dog getInstance() {
		return d;
	}
	
	
	//�����ڿ� private�ϸ� dog�� ������� ������
	private Dog() {
		// TODO Auto-generated constructor stub
	}
	private Dog(String food) {
		super();
		this.food = food;
	}
	public void eat() {
		System.out.println(this.type+"��" +food+"�� �Խ��ϴ�.");
	}
	public void bark() {
		super.toString();//����
		this.toString();//������
		System.out.println(this.type +"�� ¢���ϴ�.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type;
	}



}

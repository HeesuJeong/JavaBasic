package edu.ssafy;

public class Dog extends Animal{
	private String type = "강아지";
	private String food;
	private static Dog d = new Dog();
	
	/**
	public Dog getInstance() {
		return d;
	}
	*/
	//static으로 하면 객체를 만들지 않고도 접근 할 수 있어서 
	//static 에서는 this와 super를 만들 수 없음 
	public static Dog getInstance(String food) {
		d.food=food;
		return d;
	}
	public static Dog getInstance() {
		return d;
	}
	
	
	//생성자에 private하면 dog를 마음대로 못만듦
	private Dog() {
		// TODO Auto-generated constructor stub
	}
	private Dog(String food) {
		super();
		this.food = food;
	}
	public void eat() {
		System.out.println(this.type+"가" +food+"를 먹습니다.");
	}
	public void bark() {
		super.toString();//동물
		this.toString();//강아지
		System.out.println(this.type +"가 짖습니다.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type;
	}



}

package edu.ssafy.chap05;


//class는 메모리 허용될 때까지 생성 가능
public class Customer extends Object{
	String num;
	String name;
	int age=10;
	public Customer(String num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public Customer() {
		//System.out.println("Customer다!");
	}

	public String toString() {
		return "Customer [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

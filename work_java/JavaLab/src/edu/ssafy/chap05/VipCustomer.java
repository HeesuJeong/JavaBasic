package edu.ssafy.chap05;

public class VipCustomer extends Customer{
	String service;
	int age=20;
	
	
	public VipCustomer(String num, String name, int age, String service) {
		//Customer를 가리키는 super이므로 super()는  Customer의 생성자
		super(num,name,age); 
		//num,name,age 없지만 customer의 멤버변수를 상속받았으므로 에러 아니다.
//		this.num = num;
//		this.name = name;
//		this.age = age;
		this.service = service;
	}
	
	public VipCustomer() {
		//System.out.println("VipCustomer다ㅏ");
	}

	
	//리턴타입 int이면 오버로드에 걸려
	public String toString() {
		return "VipCustomer [num=" + num + ", name=" + name + ", age=" + age + ", service=" + service + "]";
	}
	
	
	
}

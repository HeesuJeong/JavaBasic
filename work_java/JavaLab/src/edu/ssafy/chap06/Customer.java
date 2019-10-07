package edu.ssafy.chap06;

public class Customer {
	String name;
	int age=0;

	
	//인스턴스 변수 같으면 true리턴하게 해주는 equals overriding
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Customer) {
			Customer target = (Customer) obj;
			if (this.name.equals(target.name) && this.age == target.age) {
				return true;
			}
		}
		return false;
	}
}

package edu.ssafy.chap06.two;

public class Bird extends Animal implements IFly {

	public void fly() {
		System.out.println("새가 날아요.");
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("새가 총총");
	}

}

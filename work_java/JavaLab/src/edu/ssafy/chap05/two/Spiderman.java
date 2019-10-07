package edu.ssafy.chap05.two;

public class Spiderman extends Hero{
	
	String name="Spiderman";
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public void superPower() {
		// TODO Auto-generated method stub
		System.out.println("스파이더맨 슈퍼파워");
	}
	
	public void 착하다() {
		System.out.println("스파이더맨이 착해요");
	}
	
	
}

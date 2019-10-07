package edu.ssafy;

/*
 *상위타입 일수록 일반화 
 *하위타입일수록 구체화
 *
 */
public class Animal {
	protected String type="동물";

	protected String food;

	//리턴이 있으면 메소드 생성자는 리턴이 없음...!
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
		System.out.println(this.type+"가" +food+"를 먹습니다.");
	}
	//
	@Override
	public String toString() {
		
		return this.type;
	}
}

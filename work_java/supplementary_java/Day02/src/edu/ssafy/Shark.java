package edu.ssafy;

public class Shark extends Animal{
	//private String type = "상어";
	//private String food;
	{
		this.type="상어";
	}
	
	public Shark() {
		this.type="상어";
		// TODO Auto-generated constructor stub
	}
	public Shark(String food) {
		this.type="상어";
		this.food = food;
	}
	
	//재정의
	public void eat() {
		//String meal;
		/*지역변수와 멤버변수의 차이점 
		*멤버변수는 디폴트 초기화가 일어남 
		지역변수는 초기화 하지 않으면 오류
		*/
		//System.out.println(this.type+"가" +meal+"를 먹습니다.");
			
		System.out.println(this.type+"가" +food+"를 먹습니다.");
	}
	public void swim() {
		System.out.println(this.type+"가 수영을 합니다.");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type;
	}

}

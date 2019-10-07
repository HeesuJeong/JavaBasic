package edu.ssafy.chap04;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c=new Calc(); //생성자 따로 지정 안 햇으니 default constructor가 생겨
		
		System.out.println(c.add(3, 4));
		System.out.println(c.minus(4, 3));
		
		float x=c.add(3.f,3); //실수형의 default는 double이므로 float로 캐스팅 해야해
		System.out.println(x);
	}

}

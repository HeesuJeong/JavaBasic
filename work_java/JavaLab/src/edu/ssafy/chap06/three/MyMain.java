package edu.ssafy.chap06.three;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//객체화 불가한 인터페이스 => 상위 타입으로만 사용 가능***********
		//MyInter m=new MyInter();
				
		//단 상속은 가능
		MySub m=new MySub();
		m.show();
		
		MyInter m2=new MySub();
		m2.show();
		MyInter2 m3=new MySub();
		Object m4=new MySub();
		
		
		//MyInter에서 선언한 모든 것을 MySub가 가져 => 상속과 같아
		//차이점은 implements는 여러개 가능
		//여러개 상속 받고 싶으면 하나만  extends, 나머지는 implements
	}

}

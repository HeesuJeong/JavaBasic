package edu.ssafy.chap06.three;


//여러개 상속 받고 싶으면 하나만  extends, 나머지는 implements
//object의 모든 기능 가능
//MyInter1의 모든 기능 받아 =(구체화)=> MySub가 MyInter이다.
//
public class MySub extends Object implements MyInter,MyInter2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

}

package edu.ssafy.chap06;

public abstract class AbstractTest {
	public abstract void show(); 
	//public abstract void test();
	void play() {}
}
//구현부 없는 함수=> 추상함수 
//추상함수 포함하려면 추상클래스여야해 => 추상클래스는 객체화 불가 하다!!! error 발생
//객체화도 안 되는 클래스를 언제 사용해? 상위클래스로는 사용 가능해


//상속받는 클래스의 추상함수를 꼭 구현해야 에러 안 나
 class Sub extends AbstractTest{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
 }
 
 class Sub2 extends AbstractTest{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	 
 }
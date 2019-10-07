package edu.ssafy.chap06;

//public final class FinalTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}

//상속불가
//public class sub extends FinalTest{}

//string클래스는 문자열을 literal pool에 저장해(문자열저장소) 효율적으로 문자열 사용하기 위한 저장소
//string클래스만 접근 가능한 영역 => string 상속받은 클래스로 접근 가능?? =>이를 방지하기 위해 string은 final class이다

//fianl method는 override가 안 된다. 즉 변형 불가능

public class FinalMain{
	final int a=10;
	
	public final void show() {}
	public static void main(String[] args) {
		//a=20;
		Integer in =new Integer(3);
		int a;
		//int와 Integer 서로 입력 가능
		a=in;
		in=a;
		
		
	}
}

class subsub extends FinalMain{
	//override 불가
//	public void show() {
//		
//	}
}
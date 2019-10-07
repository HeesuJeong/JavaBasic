package edu.ssafy.chap05;

//static 위치 멤버변수, 멤버함수, 내부 클래스
public class StaticTest {
	int i;
	static int si;
	
	public static void main(String[] args) {
		
		//i=100; //오류 => 객체가 만들고 사용가능한 객체 변수
		si=100; //클래스 변수이므로 바로 접근 가능
		
		//객체 안 만들고도 함수 사용 가능
		StaticTest.main(args);
		
		StaticTest st=new StaticTest();
		st.i=10;
		StaticTest st2=new StaticTest();
		
		//클래스 로딩할 때 static 영역에 올라와
		//객체 생성 안 해도 si 변수 사용 가능
		StaticTest.si=100;
		st2.i=10;
		st2.si=3000;
		
		System.out.println(StaticTest.si);
		System.out.println(st2.si);
		
	}
}

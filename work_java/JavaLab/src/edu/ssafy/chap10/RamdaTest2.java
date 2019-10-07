package edu.ssafy.chap10;

public class RamdaTest2 {

	interface Calc {
		int cal(int a, int b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스를 객체화 하려면 바로 미구현함수를 구현해야한다.
		Calc add = new Calc() {

			@Override
			public int cal(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		System.out.println(add.cal(4, 2));

		Calc minus = new Calc() {

			@Override
			public int cal(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		};
		System.out.println(minus.cal(4, 2));

		// 람다로 표현하면 훨씬 간단하다.
		Calc add2 = (a, b) -> {return a + b;};
		System.out.println(add2.cal(100, 10));
		
		//람다표현식 더 간단하게
		Calc minus2=(a,b)->a-b;
		System.out.println(minus2.cal(100, 10));

	}

}

package edu.ssafy.chap10;

public class RamdaTest3 {
	interface Calc {
		int cal(int a, int b);
	}
	interface Printer{
		void print(String str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c=(a,b)->a*b;
		Printer p=s->System.out.println(s);
		
		p.print(c.cal(10, 5)+"");
	}

}

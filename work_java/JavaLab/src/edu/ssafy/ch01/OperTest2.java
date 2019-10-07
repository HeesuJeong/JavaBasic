package edu.ssafy.ch01;

public class OperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0;
		//앞이 거짓이여도 뒤를 본다
		if ((5 > 2) & (x++ > y))
			y++;

		System.out.println("x = " + x + ", y = " + y);
		x = 0;
		y = 0;
		//앞이 거짓이면 뒤를 보지도 않는다
		if ((2 > 5) && (x++ > y))
			y++;
		System.out.println("x = " + x + ", y = " + y);
		
//		무한반복
//		for(;;) {}
	}

}

package edu.ssafy.ch01;

public class OperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0;
		//���� �����̿��� �ڸ� ����
		if ((5 > 2) & (x++ > y))
			y++;

		System.out.println("x = " + x + ", y = " + y);
		x = 0;
		y = 0;
		//���� �����̸� �ڸ� ������ �ʴ´�
		if ((2 > 5) && (x++ > y))
			y++;
		System.out.println("x = " + x + ", y = " + y);
		
//		���ѹݺ�
//		for(;;) {}
	}

}

package edu.ssafy;

public class MainTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.toString());
		
		Shark sh = new Shark();
		System.out.println(sh.toString());
		
//		Dog dd = new Dog("���ٱ�");
//		Dog dd2 = new Dog("����");
//		if(dd==dd2) {
//			System.out.println("����������");
//		}else
		
		
		//d�� d1�� ���� ��ü 
		Dog d = Dog.getInstance();
		Dog d1 = Dog.getInstance();
		if(d==d1) {
			System.out.println("���� ������ �Դϴ�.");
		}else {
			System.out.println("�ٸ� ������ �Դϴ�.");
		}
		
		System.out.println(d.toString());
	}

}

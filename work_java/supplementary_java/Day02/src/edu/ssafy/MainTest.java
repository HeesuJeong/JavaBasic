package edu.ssafy;

public class MainTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.toString());
		
		Shark sh = new Shark();
		System.out.println(sh.toString());
		
//		Dog dd = new Dog("뼈다구");
//		Dog dd2 = new Dog("개껌");
//		if(dd==dd2) {
//			System.out.println("같은강아지");
//		}else
		
		
		//d와 d1은 같은 객체 
		Dog d = Dog.getInstance();
		Dog d1 = Dog.getInstance();
		if(d==d1) {
			System.out.println("같은 강아지 입니다.");
		}else {
			System.out.println("다른 강아지 입니다.");
		}
		
		System.out.println(d.toString());
	}

}

package edu.ssafy.chap06.two;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal a =new Animal();
		Bird b=new Bird();
		Frog f=new Frog();
		Human h=new Human();
		Lion l=new Lion();
		Superman s=new Superman();
		
		toWalk(b);
		toWalk(f);
		toWalk(h);
		toWalk(l);
		toWalk(s);  //human의 walk이다
		
		//birds와 superman의 fly뽑고 싶다면
		//birds와 superman에 IFly 인터페이스 implements해
		toFly(b);
		toFly(s);
		//toFly(f);
	}
	public static void toFly(IFly f) {
		f.fly();
	}
	public static void toWalk(Animal a) {
		a.walk(); //추상클래스 Animal의 walk()
	}
}

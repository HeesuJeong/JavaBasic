package edu.ssafy.chap06.two;
//Base와

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		Base b=new Base();
		b.toAnimal(l);
		b.toRoar(l);
		b.toWalk(l);
		LionKing lk=new LionKing();
		b.toAnimal(lk);
		b.toRoar(lk); //인자가 lion이엇니 이하클래스는 괜찮
	}

}



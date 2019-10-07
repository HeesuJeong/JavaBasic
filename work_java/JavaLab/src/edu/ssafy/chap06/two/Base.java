package edu.ssafy.chap06.two;
//Main과
public class Base {
	public void toWalk(Animal a) {
		a.walk();
	}
	public void toRoar(Lion a) {
		a.roar();
	}
	public void toAnimal(Animal a) {
		System.out.println(a.whoami());
	}
}
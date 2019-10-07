package edu.ssafy;

public class MainTest02 {
	public static void main(String[] args) {
		Animal a = new Animal("사료");
		Animal d = (Animal)Dog.getInstance("뼈다구");
		Animal s = new Shark("도리");
		
		Animal[] ans = new Animal[10];
		ans[0]= a;
		ans[1]=d;
		ans[2]=s;
		
		
		for (int i = 0; i < 3; i++) {
			//System.out.println(ans[i].toString());
			ans[i].eat();
			if(ans[i] instanceof Dog) {
				Dog dog =(Dog)ans[i];
				dog.bark();
			}else if(ans[i] instanceof Shark) {
				Shark shark = (Shark)ans[i];
				shark.swim();
			}else if(ans[i] instanceof Animal) {//상위타입은 가장 마지막에 비교해주어야 함!
				Animal ani=(Animal)ans[i];
				ani.eat();
			}
		}
		
		
	}
}

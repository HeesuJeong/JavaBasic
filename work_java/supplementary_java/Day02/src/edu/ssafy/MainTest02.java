package edu.ssafy;

public class MainTest02 {
	public static void main(String[] args) {
		Animal a = new Animal("���");
		Animal d = (Animal)Dog.getInstance("���ٱ�");
		Animal s = new Shark("����");
		
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
			}else if(ans[i] instanceof Animal) {//����Ÿ���� ���� �������� �����־�� ��!
				Animal ani=(Animal)ans[i];
				ani.eat();
			}
		}
		
		
	}
}

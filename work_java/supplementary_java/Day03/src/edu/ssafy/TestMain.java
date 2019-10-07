package edu.ssafy;

public class TestMain {
	public static void main(String[] args) {
		Employee e = new Employee(1);
		System.out.println(e.whoami());
		System.out.println(e.work());
		
		Salesman s = new Salesman(2);
		System.out.println(s.whoami());
		System.out.println(s.work());
		
		Programmer p = new Programmer(3);
		System.out.println(p.whoami());
		System.out.println(p.work());

		p.goodIdea();
		p.goodIdea();
		p.goodIdea();
		System.out.println(p.work());
	}
}

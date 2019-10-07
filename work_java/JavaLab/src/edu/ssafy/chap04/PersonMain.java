package edu.ssafy.chap04;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//user defined data type은 new로 선언하면 heap공간에 객체를 생성한다
		Person p=new Person("홍길동",21,false,"장덕동");
		System.out.println(p.info());
		/*p.name="둘리";
		p.age=8;
		p.gender=false;
		p.addr="신포동";*/
		
	/*	System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.addr);*/
		
		Person p2=new Person("둘리",8,false,"쌍문동");
		System.out.println(p2.info());
		
		
		/*p2.name="고길동";
		p2.age=40;
		p2.gender=false;
		p2.addr="신포동";
		
		System.out.println(p2.info());*/
		
		Person p3=new Person(); 
		Person p4=new Person("민혜베이비",3);
		System.out.println(p4.info());
		
	}

}

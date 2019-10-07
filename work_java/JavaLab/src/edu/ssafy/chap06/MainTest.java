package edu.ssafy.chap06;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		
		
		Customer c2=new Customer();
		
		//c와c2에는 객체의 주소가 저장되어 있다.
		//if(c==c2)는 false
		c.name="kim";
		c.age=10;
		
		c2.name="kim";
		c2.age=10;
		
		if(c.equals(c2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
	}
}

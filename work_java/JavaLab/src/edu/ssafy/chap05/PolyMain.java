package edu.ssafy.chap05;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c =new Customer();
		//System.out.println(c.age);
		System.out.println(c.toString());
		VipCustomer vc=new VipCustomer();
		//System.out.println(vc.age);
		System.out.println(vc.toString());
		Customer cc=new VipCustomer(); //sub는 super가 될 수 있으므로 (Customer)생략가능 즉,auto casting된다.
		//System.out.println(cc.age);
		System.out.println(cc.toString());
		//단 VipCustomer에 추가된 기능은 접근 불가
		
		
		//그냥 적으면 컴파일 에러
		//(VipCustomer)를 new 앞에 명시해도 런타임에러 발생
		//VipCustomer vv=new Customer();
		
		
		//vc도 customer이다!!! (성용오빠도 슈퍼맨이다)
		objectPrint(c);
		objectPrint(vc);
		objectPrint(cc); //VipCustomer의 toString
	}
	public static void objectPrint(Customer v) {
		System.out.println(v.toString());
	}
	
//	public static void objectPrint(VipCustomer v) {
//		System.out.println(v.toString());
//	}
}

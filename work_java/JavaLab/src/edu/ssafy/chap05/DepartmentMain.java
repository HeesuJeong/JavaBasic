package edu.ssafy.chap05;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//같은 데이터 타입의 순서적 나열인 배열 사용하자
		Customer[] cArr=new Customer[9];
		cArr[0]=new Customer("111","둘리",8);
		cArr[1]=new Customer("222","또치",9);
		cArr[2]=new Customer("333","도우너",10);
		
		//upcasting과 overriding
		cArr[3]=new VipCustomer("211","고길동",40,"둘리 혼내기");
		cArr[4]=new VipCustomer("212","박길동",30,"발리파킹");
		cArr[5]=new VipCustomer("213","홍길동",20,"호형호제");
		
//		for (int i = 0; i < cArr.length; i++) {
//			System.out.println(cArr[i].toString());
//		}
		
		cArr[6]=new 진상();
		cArr[7]=new 진상();
		cArr[8]=new 진상();
		toArray(cArr);
		
		/*VipCustomer[] vArr=new VipCustomer[3];
		vArr[0]=new VipCustomer("211","고길동",40,"둘리 혼내기");
		vArr[1]=new VipCustomer("212","박길동",30,"발리파킹");
		vArr[2]=new VipCustomer("213","홍길동",20,"호형호제");*/
		
//		for (int i = 0; i < vArr.length; i++) {
//			System.out.println(vArr[i].toString());
//		}
//		
//		Customer cc=new VipCustomer();
//		
//		//cc.service는 안 돼
//		System.out.println(cc.age);
		
		
		
	}
	
	public static void toArray(Customer[] arr) {
/*		//올렷던거 다시 내리기 downcasting
		if(arr[5] instanceof 진상) {   //true false 리턴해
			진상 c=(진상)arr[5];
			System.out.println("진상부리기");
		}
		//올렷던거 다시 내리기 downcasting
		진상 c =(진상)arr[6];
		System.out.println(c.진상부리기());
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].toString());
//		}*/
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof 진상) {
				진상 c=(진상)arr[i];
				System.out.println("진상부리기");
			}
		}
	}
}

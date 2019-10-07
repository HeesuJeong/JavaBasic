package edu.ssafy.chap04;


/**Person 정보*/ 
class Person {
	/**이름*/
	String name;
	/**나이*/
	int age;
	/**성별*/
	boolean gender; //여자가 true
	/**주소*/
	String addr;
	
	//생성자는 여러개 가능 => 인자 수 or 데이터타입 순서 다르게 구분(overload)
	//생성자
	Person(String _n, int _a, boolean _g, String _addr){
		name=_n;
		age=_a;
		gender=_g;
		addr=_addr;
	}
	
	//default Constructor
	Person(){
		//생성자 안에 생성자 가능 안에
		this("홍길동",20);
	}
	
	Person(String _n,int age){
		//name=_n; //_n이 아니라 name이라 하면 => 지역변수 name에 지역변수 name 넣은 꼴
		this.age=age;
	}
	
	/**정보 출력*/
	String info(){
		String str= "name="+name+", age="+age+", gender"+gender+", addr="+addr+"\n";
		return str;
	}
}

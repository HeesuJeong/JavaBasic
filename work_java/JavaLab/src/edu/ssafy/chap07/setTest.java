package edu.ssafy.chap07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//set은 순서X 중복X
		HashSet set=new HashSet();
		
		//Collection<-Set<-HashSet 이므로
		//Collection set=new HashSet(); 가능
		
		
		//Collection을 상속받는 모든 얘들은 add 함수 가진다
		set.add("Seoul"); //인자를 최상위부모 object를 받으니 모든 객체 가능해
		set.add("Gwangju");
		set.add("gumi");
		set.add("Daejeon");
		set.add("Gwangju");   //중복허락하지 않기 때문에 하나만 나온다.
		
		
		//object로 업캐스팅 된 문자열을 담고 있다.
		//순서 안 지킨다.
		for(Object o:set) {
			//method는 객체를 따라가기 때문에 string의 toString()이 호출된다.
			System.out.println(o); //println은 객체를 가지면 객체의 toString을 자동 호출
		}
		
		//set에서 object의 toString()을 오버라이드 했다 => 객체들 묶어서 보여준다.
		System.out.println(set.toString());
		
		
		TreeSet<String> set2 =new TreeSet(); //트리 구조로 바꾼다. 이런 것도 있다~
		//set2.add(30); string아니므로 에러
		
		Set<Car> set3=new TreeSet();
		
		
		
	}

}

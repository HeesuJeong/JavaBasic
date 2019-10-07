package edu.ssafy.chap07;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map은 collection 계열 아니다.
		//list,set은 객체를 add로 묶지만 map은 put로 객체 담는다. 
		//(key,value)가진다.  key도 value도 object 이다.
		//key를 알고 있으면 알아서 value를 뽑아준다. => 검색에서 좋다.
		
		Map<Integer,String> m=new HashMap();
		m.put(1, "seoul");
		m.put(2,"Gwangju");
		m.put(3,"gumi");
		m.put(4,"Daejeon");
		
		System.out.println(m.get(2));
		
		for(Integer key:m.keySet()) {
			System.out.println(key+":"+m.get(key));
		}
	}

}

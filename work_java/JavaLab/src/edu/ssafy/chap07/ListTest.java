package edu.ssafy.chap07;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List 중복O 순서O
		List<Integer> li=new ArrayList();
		li.add(30);
		li.add(50);
		li.add(50);
		li.add(60);
		li.add(60); //중복저장 가능
		for(Integer o:li) {
			System.out.println(o);
		}
		System.out.println(li.toString());
		
		System.out.println(li.get(1)); //순서지켜지므로 인덱스 접근 가능
		
		System.out.println(li.size());
		System.out.println("====================");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
	}

}

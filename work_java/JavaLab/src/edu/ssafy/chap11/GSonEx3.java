package edu.ssafy.chap11;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class GSonEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson(); 
		
		//객체가 3개짜리인 배열
		String jsonString = "[{'num':'lee','name':'Min','age':26,'address':'Seoul'},"
							+ "{'num':'park','name':'park','age':27,'address':'Seoul'},"
							+ "{'num':'kim','name':'kim','age':28,'address':'Incheon'}]"; 
		// json object Array => object 
		Member[] array = gson.fromJson(jsonString, Member[].class); 
		
		//객체가 들어있는 배열을 보여줌
		List<Member> list = Arrays.asList(array);
		System.out.println(list.toString());
		
		//object Array => json Object Array
		
		
		//리스트를 json으로 보여줌
		String json = gson.toJson(list);
		System.out.println(json);
		
		
		
	}

}

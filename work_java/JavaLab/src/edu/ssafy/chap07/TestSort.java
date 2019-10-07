package edu.ssafy.chap07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestSort  {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//comparator는 첫번째와 두번째 받는거 비교해 
				Comparator<Car> com = new Comparator<Car>() {

					@Override
					public int compare(Car o1, Car o2) {
						// TODO Auto-generated method stub
							return o1.price-o2.price;
					}}; 
					
					
		Car[] cars=new Car[5];
		cars[0]=new Car("111",5000);
		cars[1]=new Car("555",3500);
		cars[2]=new Car("333",4600);
		cars[3]=new Car("999",5350);
		cars[4]=new Car("000",5090);
		
		//Arrays.sort(cars); 어떤기준인지 모르기 때문에 에러얌 => 정렬기준 만들어 주는 Comparable<인자>
	
		Arrays.sort(cars,com);
		for(Car c:cars) {
			System.out.println(c);
		}
		
		ArrayList<Car> list=new ArrayList();
		list.add(new Car("111",5000));
		list.add(new Car("555",3500));
		list.add(new Car("333",4600));
		list.add(new Car("999",5350));
		list.add(new Car("000",5090));
		
		System.out.println("============");
		Collections.sort(list,com);
		for(Car car:list) {
			System.out.println(car);
		}
		
		
			
	}

}

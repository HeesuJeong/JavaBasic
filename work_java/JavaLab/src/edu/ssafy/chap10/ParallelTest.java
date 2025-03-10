package edu.ssafy.chap10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("일길동","이길동","삼길동","사길동","오길동","육길동","칠길동","팔길동","구길동",
				"십길동","십일길동","십이길동","십삼길동","십사길동","십오길동");
		
		//main thread가 
//		Stream<String> stream=list.stream();
//		stream.forEach(ParallelTest::print);
		
		//main 스레드는 몇 개만 출력하고.. 다른 여러 개의 스레드가 병렬로 출력한다. 
		Stream<String> parall=list.parallelStream();
		parall.forEach(ParallelTest::print);
		
		List<Integer> listi=Arrays.asList(100,200,300,400,500,600,700,800,900);
		Stream<Integer> stream=listi.stream();
		stream.forEach(ParallelTest::print);
		
		Stream<Integer> parallelStream=listi.parallelStream();
		parallelStream.forEach(ParallelTest::print);
		
		stream.forEach(name->System.out.println(name));
		parallelStream.forEach(name->System.out.println(name));
		
		
	}
	public static void print(Integer str) {
		System.out.println(str+" : "+Thread.currentThread());
	}
	public static void print(String str) {
		System.out.println(str+" : "+Thread.currentThread());
	}
}

package edu.ssafy.chap02;

public class ArrayTest {
	// Array
	// 정의: 같은 데이터타입의 순서적 나열(자료구조중 가장 빠른 검색이 가능하다)
	// 특징: 선언과 동시에 크기가 결정됨, 크기 변경 불가
	// 배열은 생성하면 타입에 따라 기본값을 초기화됨
	// 정수 0, 실수 0.0, 문자 \u0000, 논리 false, 참조(reference) null
	public static void main(String[] args) {
		int kuk = 100, math = 80, eng = 50;
		int sum = kuk + math + eng;
		System.out.println(sum);

		int[] study = new int[3];
		study[0] = 10;
		study[1] = 20;
		study[2] = 30;

		sum = study[0] + study[1] + study[2];
		System.out.println(sum);

		float[] arr = new float[3];
		System.out.println(arr[0]); // 0.0로 초기화

		char arr1[] = new char[3];
		System.out.println(arr1[0]);

		boolean arr2[] = new boolean[3];
		System.out.println(arr2[0]); // false로 초기화

		System.out.println(arr1.length);

		testFunc(kuk); // call by value
		System.out.println("main안 kuk 점수 : " + kuk);

		testFunc2(study); // call by reference
		System.out.println("main안 kuk2 점수 : " + study[0]);

		Member m = new Member();
		Member m2 = new Member();
		Member[] marr = new Member[5];
		marr[0] = m;
		marr[1] = m2;
		marr[2] = new Member();
	}

	public static void testFunc(int a) {
		a--;
		System.out.println("kuk 점수 : " + a);
	}

	public static void testFunc2(int[] a) {
		a[0]--;
		System.out.println("kuk2 점수 : " + a[0]);
	}

}

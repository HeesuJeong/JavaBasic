package edu.ssafy.chap02;

public class ArrayTest {
	// Array
	// ����: ���� ������Ÿ���� ������ ����(�ڷᱸ���� ���� ���� �˻��� �����ϴ�)
	// Ư¡: ����� ���ÿ� ũ�Ⱑ ������, ũ�� ���� �Ұ�
	// �迭�� �����ϸ� Ÿ�Կ� ���� �⺻���� �ʱ�ȭ��
	// ���� 0, �Ǽ� 0.0, ���� \u0000, �� false, ����(reference) null
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
		System.out.println(arr[0]); // 0.0�� �ʱ�ȭ

		char arr1[] = new char[3];
		System.out.println(arr1[0]);

		boolean arr2[] = new boolean[3];
		System.out.println(arr2[0]); // false�� �ʱ�ȭ

		System.out.println(arr1.length);

		testFunc(kuk); // call by value
		System.out.println("main�� kuk ���� : " + kuk);

		testFunc2(study); // call by reference
		System.out.println("main�� kuk2 ���� : " + study[0]);

		Member m = new Member();
		Member m2 = new Member();
		Member[] marr = new Member[5];
		marr[0] = m;
		marr[1] = m2;
		marr[2] = new Member();
	}

	public static void testFunc(int a) {
		a--;
		System.out.println("kuk ���� : " + a);
	}

	public static void testFunc2(int[] a) {
		a[0]--;
		System.out.println("kuk2 ���� : " + a[0]);
	}

}

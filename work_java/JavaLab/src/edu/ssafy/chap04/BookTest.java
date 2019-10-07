package edu.ssafy.chap04;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("21424", "Java Pro", "heesu", "Jaen.kr", 15000, "Java grammer");
		// Book b2=new Book("35355","분석설계","소나무","Jaen.kr",30000,"SW 모델링");

		System.out.println(b1.toString());

		b1.setIsbn("35355");
		b1.setTitle("engine");
		b1.setAuthor("tree");
		b1.setPrice(30000);
		b1.setDesc("SW modeling");
		System.out.println(b1.toString());

		Book b2 = new Book("11111", "Java Basic", "hana", "test pu", 99999, "Java basic");
		
		System.out.println(b2.toString());

		System.out.println("\n\n<Magine 목록입니다.>");
		Magazine m1 = new Magazine("35535", "Java World", "i", "java.com", 2018, 2, 7000, "first");
		System.out.println(m1.toString());
		
		//m2객체 생성시 month범위 아웃=>0으로 출력
		Magazine m2 = new Magazine("35535", "Java World", "love", "java.com", 2018, 15, 7000, "second");
		System.out.println(m2.toString());
		System.out.println("\n**잠깐 month 입력 테스트 해봅시다**");
		m2.setMonth(200);
		System.out.println(m2.getMonth()); //month의 범위 지정했다는 것을 보여줌
		System.out.println("\n");
		//년도 아웃 -> 년도 0으로 출력
		Magazine m3=new Magazine("99999", "Java Java", "you", "java.com", 2200, 9, 7000, "third");
		System.out.println(m3.toString());
		
		/*Book[] bArr=new Book[3];
		bArr[0].setAuthor("me"); //에러야
		//배열 선언은 샤넬백 세개 담는 봉투만 있는거야
		//bArr[0]=new Book(); 해줘야해
*/	}

}

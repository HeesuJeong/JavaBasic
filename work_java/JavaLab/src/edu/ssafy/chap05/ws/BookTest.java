package edu.ssafy.chap05.ws;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager b=new BookManager();
		b.add(new Book(21424, "Java Pro", "heesu", "Jaen", 15000, "Java grammer"));
		b.add(new Book(11111, "Java Basic", "hana", "test pu1", 99999, "Java basic"));
		b.add(new Book(22222, "Java", "second", "hee", 99999, "Java Original"));
		b.add(new Book(33333, "Java Ad", "third", "test3", 10000, "Java Ad"));
		b.add(new Book(44444, "C++ Basic", "fourth", "test4", 20000, "C++ basic"));
		
		b.add(new Magazine(44444, "Java World", "heesu", "Jaen", 7000, "first",2018, 2));
		b.add(new Magazine(35535, "Java World", "heesu", "hee", 7000, "first",2018, 2));
		b.add(new Magazine(35535, "Java World", "heesu", "su", 7000, "first",2018, 2));
		b.add(new Magazine(35535, "Java World", "heesu", "hee", 99999, "first",2018, 2));
		b.add(new Magazine(35535, "Java World", "heesu", "Jaen", 7000, "first",2018, 2));
		
		
		b.searchAll();
		System.out.println("<책 이름으로 검사하기>");
		b.searchTitle("Java World");
		b.searchTitle("Java Pro");
		
		System.out.println("<lsbn으로 검사하기>");
		b.searchLsbn(44444);
		
		b.searchBook();
		b.searchMagazine();
		
		System.out.println("<출판사로 검사하기>");
		b.searchPublisher("hee");
		
		System.out.println("<가격으로 검사하기>");
		b.searchPrice(99999);
		
		System.out.println("<모든 도서의 금액 합계를 출력합니다>");
		b.totalMoney();
		
		System.out.println("<모든 도서의 금액 평균을 출력합니다>");
		b.Average();
		
		
	}

}

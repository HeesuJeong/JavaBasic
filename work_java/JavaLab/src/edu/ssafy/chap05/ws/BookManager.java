package edu.ssafy.chap05.ws;

public class BookManager {
	private Book[] books;
	private int max=5;
	private int index=0;
	
	public BookManager() {
		books=new Book[max];
	}
	
//데이터 입력
	public void add(Book b) {
		if(index<max) {
			books[index]=b;
			index++;
		}else {
			Book[] temp = new Book[max*2];
			max*=2;
			System.arraycopy(books, 0, temp, 0, books.length);
			books=temp;
			books[index]=b;
			index++;
		}
	}
//데이터 전체 검색
	public void searchAll() {
		System.out.println("저장된 데이터 모두 출력합니다");
		for (int i = 0; i < index; i++) {
			System.out.println(books[i].toString());
		}
	}
//lsbn으로 검색
	public void searchLsbn(int a) {
		System.out.println(a+" 검색 기록입니다.");
		for(int i=0;i<index;i++) {
			if(a==books[i].getIsbn()) {
				System.out.println(books[i].toString());
			}
		}
	}
//title로 정보 검색
	public void searchTitle(String title) {
		System.out.println(title+" 검색 기록입니다.");
		for(int i=0;i<index;i++) {
			if(title.equals(books[i].getTitle())) {
				System.out.println(books[i].toString());
			}
		}
	}
//book만 검색
	public void searchBook() {
		System.out.println("모든 책을 출력합니다");
		for (int i = 0; i < books.length; i++) {
			if(!(books[i] instanceof Magazine)) {
				System.out.println(books[i].toString());
			}
		}
	}
//magazine만 검색
	public void searchMagazine() {
		System.out.println("모든 잡지를 출력합니다");
		for (int i = 0; i < books.length; i++) {
			if(books[i] instanceof Magazine) {
				books[i]=(Magazine)books[i];
				System.out.println(books[i].toString());
			}
		}
	}
	/////////////7번 구현필요 void searchThisYearM();
//출판사로 검색
	public void searchPublisher(String p) {
		System.out.println(p+" 검색 기록입니다.");
		for(int i=0;i<index;i++) {
			if(p.equals(books[i].getPublisher())) {
				System.out.println(books[i].toString());
			}
		}
	}
//가격으로 검색 기능
	public void searchPrice(int p) {
		System.out.println(p+" 검색 기록입니다.");
		for(int i=0;i<index;i++) {
			if(p==books[i].getPrice()) {
				System.out.println(books[i].toString());
			}
		}
	}
//저장된 모든 도서 금액 합계
	public void totalMoney() {
		int sum=0;
		for(int i=0;i<index;i++) {
			sum+=books[i].getPrice();
		}
		System.out.println("모든 도서의 금액 합계는 "+sum+"입니다");
	}
//저장된 모든 도서 금액 평균
	public void Average() {
		int sum=0;
		for(int i=0;i<index;i++) {
			sum+=books[i].getPrice();
		}
		float resul=(float)sum/index;
		System.out.println("모든 도서의 금액 평균은 "+resul+"입니다");
	}
}

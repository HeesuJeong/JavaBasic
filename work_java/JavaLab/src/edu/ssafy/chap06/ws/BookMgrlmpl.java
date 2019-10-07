package edu.ssafy.chap06.ws;

public class BookMgrlmpl extends Book implements IBookMgr {

	private Book[] books;
	private int max = 5;
	private int index = 0;

	public BookMgrlmpl() {
		books = new Book[max];
	}

	@Override
	public void add(Book b) {
		// TODO Auto-generated method stub
		if (index < max) {
			books[index] = b;
			index++;
		} else {
			Book[] temp = new Book[max * 2];
			max *= 2;
			System.arraycopy(books, 0, temp, 0, books.length);
			books = temp;
			books[index] = b;
			index++;
		}
	}

	@Override
	public void searchAll() {
		// TODO Auto-generated method stub
		System.out.println("저장된 데이터 모두 출력합니다");
		for (int i = 0; i < index; i++) {
			System.out.println(books[i].toString());
		}
	}

	@Override
	public void searchLsbn(int a) {
		// TODO Auto-generated method stub
		System.out.println(a + " 검색 기록입니다.");
		for (int i = 0; i < index; i++) {
			if (a == books[i].getIsbn()) {
				System.out.println(books[i].toString());
			}
		}
	}

	@Override
	public void searchTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println(title + " 검색 기록입니다.");
		for (int i = 0; i < index; i++) {
			if (title.equals(books[i].getTitle())) {
				System.out.println(books[i].toString());
			}
		}
	}

	@Override
	public void searchBook() {
		// TODO Auto-generated method stub
		System.out.println("모든 책을 출력합니다");
		for (int i = 0; i < books.length; i++) {
			if (!(books[i] instanceof Magazine)) {
				System.out.println(books[i].toString());
			}
		}
	}

	@Override
	public void searchMagazine() {
		// TODO Auto-generated method stub
		System.out.println("모든 잡지를 출력합니다");
		for (int i = 0; i < books.length; i++) {
			if (books[i] instanceof Magazine) {
				books[i] = (Magazine) books[i];
				System.out.println(books[i].toString());
			}
		}
	}

	@Override
	public void searchThisYearM() {
		// TODO Auto-generated method stub
		System.out.println("올해 잡지를 출력합니다");
		for (int i = 0; i < books.length; i++) {
			if (books[i] instanceof Magazine) {
				Magazine tmp = (Magazine) books[i];
				if (tmp.getYear() == 2019) {

					System.out.println(tmp.toString());
				}

			}
		}
	}

	@Override
	public void searchPublisher(String p) {
		// TODO Auto-generated method stub
		System.out.println(p + " 검색 기록입니다.");
		for (int i = 0; i < index; i++) {
			if (p.equals(books[i].getPublisher())) {
				System.out.println(books[i].toString());
			}
		}
	}

	@Override
	public void searchPrice(int p) {
		// TODO Auto-generated method stub
		System.out.println(p + " 검색 기록입니다.");
		for (int i = 0; i < index; i++) {
			if (p == books[i].getPrice()) {
				System.out.println(books[i].toString());
			}
		}
	}

	@Override
	public void totalMoney() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += books[i].getPrice();
		}
		System.out.println("모든 도서의 금액 합계는 " + sum + "입니다");
	}

	@Override
	public void Average() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += books[i].getPrice();
		}
		float resul = (float) sum / index;
		System.out.println("모든 도서의 금액 평균은 " + resul + "입니다");
	}

}

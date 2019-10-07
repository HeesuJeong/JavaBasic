package edu.ssafy.chap10.hw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BookMain {
	Scanner s=new Scanner(System.in);
	IBookMgr mgr=BookMgrImpl.getInstance();    

	public static void main(String[] args) {
		BookMain m=new BookMain();
		int num=0;
		while(true) {
			num=m.menu();
			if(num==0) break;
			switch (num){
			//도서등록
				case 1:
					m.insert();
					break;
			//도서 목록 보기
				case 2:
					m.search();
					break;
			//ISBN으로 도서검색
				case 3:
					m.searchIsbn();
					break;
			//도서명 도서검색(**기능 삭제**)
				case 4:
					//m.searchTitle();
					break;
			//도서 수정
				case 5:
					m.update();
					m.search();
					break;
			//도서 삭제
				case 6:
					m.delete();
					m.search();
					break;
			//도서 정보 파일 저장
				case 7:
					m.save();
					break;
			//도서 정보 파일로 부터 읽어오기
				case 8:
					m.load();
					m.search();
					break;
			//ISBN으로 정렬해서 목록보기
				case 9:
					m.sortIsbn();
					break;
			//도서명 중 가장 빈도수 높은 단어 구하기
				case 10:
					System.out.println("미구현된 기능입니다.");
					break;
				case 11:
					m.sendServer();
					break;
			}//end switch
			
		}//end while
	}
	public  int menu() {
		int result=0;
		System.out.println("==================================");
		System.out.println("========== 도서 관리 프로그램 ===========");
		System.out.println("==================================");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록 보기");
		System.out.println("3. 도서 검색(ISBN으로 검색)");
		System.out.println("4. 도서 검색(도서명으로 검색)");
		System.out.println("5. 도서 수정");
		System.out.println("6. 도서 삭제");
		System.out.println("7. 도서 정보 파일 저장");
		System.out.println("8. 도서 정보 파일로 부터 읽어오기");
		System.out.println("9. ISBN으로 정렬해서 목록보기");
		System.out.println("10.도서명 중 가장 빈도수 높은 단어 구하기");
		System.out.println("11. 서버로 객체 전송 후, 서버에서 파일 저장하기");
		System.out.println("0. 종료");
		System.out.println("원하는  번호를 선택 하세요.");
		result=Integer.parseInt(s.nextLine());
		return result;
	}
	
	public void sendServer() {
		System.out.println("서버로 arraylist 객체 전송 후 서버에서 파일을 저장합니다.");
		try {
			mgr.send();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public void insert() {
    	System.out.println("도서 정보를 입력하세요. 형식:ISBN,도서명,저자,금액");
    	String[] info=s.nextLine().split(",");
    	Book input=new Book(info[0],info[1],info[2],Integer.parseInt(info[3]));
    	try {
			mgr.add(input);
		} catch (DuplicateException e) {
			// TODO Auto-generated catch block
			e.showErr();
		}
    	
    }
    public void search() {
    	System.out.println(">>>>>>>>  도서 목록 보기 ");
    	if(mgr.search()!=null) {
    	for(Book b:mgr.search()) System.out.println(b);
    	}
    }
    public void searchIsbn() {
    	System.out.println(">>>>>>>>  도서  검색 (ISBN으로 검색) ");
    	System.out.println("검색하고자하는 ISBN을 입력하세요.");
    	String isbn=s.nextLine();
    	
    	try {
			System.out.println(mgr.search(isbn));
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.showErr();
		}
    }
    
    /*public void searchTitle() {
    	System.out.println(">>>>>>>>  도서  검색 (이름으로 검색) ");
    	System.out.println("검색하고자하는 이름을 입력하세요.");
    	String title=s.nextLine();

    	// 구현하세요.
    }
*/    
    public void update() {
    	System.out.println(">>>>>>>>  도서  수정 ");
    	System.out.println("수정하고자하는 ISBN,가격을 입력하세요.");
    	String[] info=s.nextLine().split(",");
    	try {
			mgr.update(info[0], Integer.parseInt(info[1]));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("number format exception입니다.");
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.showErr();
		}
    }
    public void delete() {
    	System.out.println(">>>>>>>>  도서  삭제 ");
    	System.out.println("삭제하고자하는 ISBN을 입력하세요.");
    	String isbn=s.nextLine();
    	try {
			mgr.delete(isbn);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.showErr();
		}
    }
    public void save() {
    	System.out.println(">>>>>>>>  도서  정보 저장 ");
    	mgr.save();
    }
    public void load() {
    	System.out.println(">>>>>>>>  도서  정보 읽어오기 ");
    	try {
			mgr.load();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다. 파일 생성 후 로드하세요.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("도서 목록이 비어있습니다.");
		}
    }
    public void sortIsbn() {
    	System.out.println(">>>>>>>>  도서ISBN로 정렬하기 ");
    	for(Book b:mgr.sortIsbn()) System.out.println(b);
    }
    public void countWord() {
    	System.out.println(">>>>>>>>  빈도수 높은 단어 구하기 ");

    	// 구현하세요.
    	
    	
    }
   /* public void sortTitle() {
    	System.out.println(">>>>>>>>  도서이름로 정렬하기 ");
    	List<Book> bs=mgr.sortTitle();
    	for(Book e: bs) {
    		System.out.println(e);
    	}
    }    */
}
package edu.ssafy.chap10.hw;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BookMgrImpl implements IBookMgr {

	ArrayList<Book> li;

	// 생성자
	private BookMgrImpl() {
		// TODO Auto-generated constructor stub
		li = new ArrayList<>();
		// 파일 존재 여부 판단해야해. 존재시 파일 읽기
		try {
			load();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.out.println("IO exception 발생하였습니다.");
		}
	}

	// singleton
	private static BookMgrImpl instance;

	public static BookMgrImpl getInstance() {
		if (instance == null)
			instance = new BookMgrImpl();
		return instance;
	}

	// 파일에 저장된 도서정보 가져오기
	@Override
	public void load() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream("books.dat"));
		ois.reset(); //전의 기록 지우고 list 그대로 옮기기 위해
		try {
			li = (ArrayList<Book>) ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class없습니다.");
		} finally {
			
			ois.close();
		}
	}

	// 파일에 도서정보 저장하기
	@Override
	public void save() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("books.dat"));
			oos.writeObject(li);
			System.out.println(li.size()+"개의 정보를 저장했습니다.");
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void add(Book b) throws DuplicateException {
		// TODO Auto-generated method stub
		boolean exist = false;
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i).getIsbn().equals(b.getIsbn())) {
				exist = true;
				break;
			}
		}
		if (exist) {
			throw new DuplicateException("데이터가 중복되었습니다.");
		} else {
			li.add(b);
		}
	}

	// 모든 도서 정보 리턴
	@Override
	public List<Book> search() {
		// TODO Auto-generated method stub
		return li;
	}

	// isbn으로 검색
	@Override
	public Book search(String isbn) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		boolean find = false;
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i).getIsbn().equals(isbn)) {
				find = true;
				return li.get(i);
			}
		}
		//동일한 isbn이 없는 경우 
		if (find == false) {
			throw new RecordNotFoundException("데이터가 없습니다.");
		}
		return null;
	}

	@Override
	public void update(String isbn, int price) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		boolean find=false;
		for (int i = 0; i < li.size(); i++) {
			if(li.get(i).getIsbn().equals(isbn)) {
				find=true;
				li.get(i).setPrice(price);
				break;
			}
		}
		if(find==false) throw new RecordNotFoundException("데이터가 없습니다.");
	}

	@Override
	public void delete(String isbn) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		boolean find=false;
		for (int i = 0; i < li.size(); i++) {
			if(li.get(i).getIsbn().equals(isbn)) {
				System.out.println(li.get(i).getTitle()+" 활용도서가 삭제 되었습니다.");
				find=true;
				li.remove(i);
				break;
			}
		}
		if(find==false) throw new RecordNotFoundException("데이터가 없습니다.");
	}

	@Override
	public List<Book> searchTitle(String title) {
		// TODO Auto-generated method stub
		List<Book> tmp=new ArrayList<>();
		for (int i = 0; i < li.size(); i++) {
			if(li.get(i).getTitle().equals(title)) {
				tmp.add(li.get(i));
			}
		}
		return tmp;
	}

	@Override
	public List<Book> sortIsbn() {
		// TODO Auto-generated method stub
		Comparator<Book> com=new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getIsbn().compareTo(o2.getIsbn());
			}
		};
		
		Collections.sort(li,com);
		return li;
	}

	public void send() throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",7000);
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(s.getOutputStream()));
		oos.writeObject(li);
		oos.flush();
		//close하면 서버로부터 더 이상 정보 못 받기 때문에 oos.flush()는 안 하기
	}
	
	
	@Override
	public String countWord() {
		// TODO Auto-generated method stub
		return null;
	}

}

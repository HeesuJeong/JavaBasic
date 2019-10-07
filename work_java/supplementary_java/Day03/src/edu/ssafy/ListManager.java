package edu.ssafy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.imageio.stream.FileImageInputStream;

public class ListManager implements IManager {

	// singleton constructor
	private static ListManager man = new ListManager();

	// singleton constructor
	private ListManager() {
	};

	// employee storage
	private ArrayList<Employee> list = new ArrayList<>();

	public static ListManager getIncetance() {
		return man;
	}

	@Override
	public void add(Employee emp) {
		list.add(emp);
	}

	@Override
	public void modify(Employee emp) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).num == emp.num) {
				list.set(i, emp);
			}
		}
	}

	@Override
	public void delete(Employee emp) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).num == emp.num) {
				list.remove(i);
			}
		}
	}

	@Override
	public ArrayList<Employee> searchAll() {
		return list;
	}

	/**
	 * 근로자를 찾는 메소드
	 * 
	 * @param 근로자 번호
	 * @return Employee 찾지 못하면 null
	 * @throws MyDataNotFoundException 
	 */
	@Override
	public Employee search(int num) throws MyDataNotFoundException {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).num == num) {
				return list.get(i);
			}
		}
		throw new MyDataNotFoundException();
		
	}

	@Override
	public void allWork() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).work());
		}
	}

	// 파일에 저장하는 메소드
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("emp.save");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 파일에서 불러오는 메소드
	public void restore() {
		
		try {
			FileInputStream fis = new FileInputStream("emp.save");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Employee> readObject = (ArrayList<Employee>) ois.readObject();
			if (!list.isEmpty()) {
				this.list = list;
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

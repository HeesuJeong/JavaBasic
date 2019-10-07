package edu.ssafy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapManager implements IManager {

	// singleton constructor
	private static MapManager man = new MapManager();

	// singleton constructor
	private MapManager() {
	};

	// employee storage
	private HashMap<Integer, Employee> map = new HashMap<>();

	public static MapManager getIncetance() {
		return man;
	}

	@Override
	public void add(Employee emp) {
		map.put(emp.num, emp);
	}

	@Override
	public void modify(Employee emp) {
		map.put(emp.num,emp);
	}

	@Override
	public void delete(Employee emp) {
		map.remove(emp.num);
	}

	@Override
	public ArrayList<Employee> searchAll() {
		ArrayList<Employee> list = new ArrayList<>();
		Set<Integer>keySet = map.keySet();
		for(Integer i :keySet)
			list.add(map.get(i));
		return list;
		
	}

	@Override
	public Employee search(int num) {
		return map.get(num);
	}

	@Override
	public void allWork() {
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restore() {
		// TODO Auto-generated method stub
		
	}

}

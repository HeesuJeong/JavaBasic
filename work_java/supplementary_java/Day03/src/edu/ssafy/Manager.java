package edu.ssafy;

public final class Manager {//final을 했기 때문에 상속도 안되고 상속 안되니까 override도 안됨 
	private static Manager man = new Manager();
	
	private Employee[] emps = new Employee[10];
	
	private int index; //사원이 몇명있는지.. 객체의 변수는 항상 디폴트 초기화가 일어남 
	
	private Manager() {}
	
	public static Manager getInstance() { //싱글톤패턴
		if(man !=null)return man;
		else return null;
	}
	public int add(Employee emp) {
		emps[index] = emp;
		index++;
		return index;
		
	}
	public int modify(Employee emp) {
		for (int i = 0; i < index; i++) {
			if(emps[i].num ==emp.num) {
				emps[i]=emp;
				return i;
			}
		}
		return -1;
	}
	public int delete(Employee emp) {
		for (int i = 0; i < index; i++) {
			if(emps[i].num ==emp.num) {
				emps[i]=emps[index-1];
				emps[index-1]=null;
				index--;
				return i;
			}
		}
		return -1;
		
	}
	public Employee[] searchAll() {
		Employee[] temp= new Employee[index-1];
		System.arraycopy(emps, 0, temp, 0, index);
		return temp;
	}
	public Employee search(int num) {
		for (int i = 0; i < index; i++) {
			if(emps[i].num ==num) {
				return emps[i];
			}
		}
		return null;
	}
	public void allWork() {
		for (int i = 0; i < index; i++) {
			System.out.println(emps[i].work());
			
		}
	}
}

package edu.ssafy.chap06.two;

public abstract class Animal {
	public String whoami() {
		return "동물";
	}
	public abstract void walk();
}
//Animal의 자식들은 어떻게 걷는지?를 재정의(override) 해야해 => 오버라이드 안 하면 객체화 안 돼/ 안그럼 자식도 추상클래스 돼
//그리고 whoami()로 모두가 동물이 돼
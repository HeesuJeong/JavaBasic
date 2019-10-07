package edu.ssafy.chap07;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic g=new Generic();
		
		
		//I타입이 뭔지 모르므로 그냥 object로 받아들여
		g.setI(30);
		g.setI(30);
		Object i=g.getI();
		
		
		Generic<String> g2=new Generic();
		g2.setI("Hello");
		String i2=g2.getI();
		
		//primitive type이 아니라 객체타입으로 지정해야해
		Generic<Integer> g3=new Generic();
		g3.setI(30);
		int i3=g3.getI();
		
		//referenced type 된다.
		//Generic<Car> g4=new Generic();
		
		
		
	}

}

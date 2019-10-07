package edu.ssafy.chap07;

//데이터를 저장하는 클래스 entity bean
public class Car  {
	String num;
	int price;

	public Car() {

	}

	public Car(String num, int price) {
		super();
		this.num = num;
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}

//	@Override
//	public int compareTo(Car o) {
//		// TODO Auto-generated method stub
//		if (o != null) {
//			//System.out.println("prcice: "+price+"o.price: "+o.price);
//			return price - o.price; // 음수로변환
//			}
//			return 0;
//		}
	}


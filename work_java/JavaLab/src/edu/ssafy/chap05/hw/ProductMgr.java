package edu.ssafy.chap05.hw;



public class ProductMgr {
	private Product[] products;
	private int max=5;
	private int index=0;
	
	public ProductMgr() {
		products=new Product[max];
	}
	
	//데이터 입력부분
	public void add(Product p) {
		if(index<max) {
			products[index]=p;
			index++;
		}else {
			Product[] temp=new Product[max*2];
			max*=2;
			System.arraycopy(products, 0, temp, 0, products.length);
			products=temp;
			products[index]=p;
			index++;
		}
	}
	
	//상품정보 전체 검색
	public void searchAll() {
		System.out.println("모든 상품 정보 출력합니다");
		for (int i = 0; i < index; i++) {
			System.out.println(products[i].toString());
		}
	}
	//상품번호로 상품을 검색
	public void searchLsbn(int a) {
		System.out.println(a+" 번호 상품 정보입니다.");
		for(int i=0;i<index;i++) {
			if(a==products[i].getIsbn()) {
				System.out.println(products[i].toString());
			}
		}
	}
	//상품명으로 검색(부분 검색 가능)
	public void searchName(String n) {
		System.out.println(n+" 이 포함된 이름을 가진 상품 정보입니다.");
		for(int i=0;i<index;i++) {
			if(products[i].getName().contains(n)) {
				System.out.println(products[i].toString());
			}
		}
	}
	//TV정보만 검색
	public void searchTV() {
		System.out.println("모든 TV를 출력합니다");
		for (int i = 0; i < index; i++) {
			if(products[i] instanceof TV) {
				System.out.println(products[i].toString());
			}
		}
	}
	//400L 이상 Refrigerator만 검색
	public void searchRefrigerator() {
		System.out.println("모든 Refrigerator를 출력합니다");
		for (int i = 0; i < index; i++) {
			if(products[i] instanceof Refrigerator) {
				Refrigerator tmp=(Refrigerator)products[i];
				if(tmp.getFullL()>=400) {
				System.out.println(tmp.toString());
				}
			}
		}
	}
	//50inch 이상  TV
	public void search50Inch() {
		System.out.println("50인치 이상의 TV를 출력합니다");
		for (int i = 0; i < index; i++) {
			if(products[i] instanceof TV) {
				TV tmp=(TV)products[i];
				if(tmp.getInch()>=50) {
				System.out.println(tmp.toString());
				}
			}
		}
	}
	
	//상품번호의 가격 변경
	public void update(int n,int p) {
		System.out.println(n+"번호의 상품 가격을"+p+"로 변경합니다.");
		for (int i = 0; i < index; i++) {
			if(n==products[i].getIsbn()) {
				products[i].setMoney(p);
			}
		}
	}
	
	//상품번호로 상품 삭제
	public void delProduct(int n) {
		for (int i = 0; i < index; i++) {
			if(n==products[i].getIsbn()) {
				products[i]=products[index-1];
				index--;
			}
		}
	}
	
	//전체 재고 상품 금액 구하기
	public void totalMoney() {
		int sum=0;
		for(int i=0;i<index;i++) {
			sum+=products[i].getMoney();
		}
		System.out.println("모든 도서의 금액 합계는 "+sum+"입니다");
	}
}

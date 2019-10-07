package edu.ssafy.chap06.hw;


public class ProductMgrlmpl extends Product implements IProductMgr{

	private Product[] products;
	private int max=5;
	private int index=0;
	
	public ProductMgrlmpl() {
		products=new Product[max];
	}
	
	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
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

	@Override
	public void searchAll() {
		// TODO Auto-generated method stub
		System.out.println("모든 상품 정보 출력합니다");
		for (int i = 0; i < index; i++) {
			System.out.println(products[i].toString());
		}
	}

	@Override
	public void searchLsbn(int a) {
		// TODO Auto-generated method stub
		System.out.println(a+" 번호 상품 정보입니다.");
		for(int i=0;i<index;i++) {
			if(a==products[i].getIsbn()) {
				System.out.println(products[i].toString());
			}
		}
	}

	@Override
	public void searchName(String n) {
		// TODO Auto-generated method stub
		System.out.println(n+" 이 포함된 이름을 가진 상품 정보입니다.");
		for(int i=0;i<index;i++) {
			if(products[i].getName().contains(n)) {
				System.out.println(products[i].toString());
			}
		}
	}

	@Override
	public void searchTV() {
		// TODO Auto-generated method stub
		System.out.println("모든 TV를 출력합니다");
		for (int i = 0; i < index; i++) {
			if(products[i] instanceof TV) {
				System.out.println(products[i].toString());
			}
		}
	}

	@Override
	public void searchRefrigerator() {
		// TODO Auto-generated method stub
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

	@Override
	public void search50Inch() {
		// TODO Auto-generated method stub
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

	@Override
	public void update(int n, int p) {
		// TODO Auto-generated method stub
		System.out.println(n+"번호의 상품 가격을"+p+"로 변경합니다.");
		for (int i = 0; i < index; i++) {
			if(n==products[i].getIsbn()) {
				products[i].setMoney(p);
			}
		}
	}

	@Override
	public void delProduct(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if(n==products[i].getIsbn()) {
				products[i]=products[index-1];
				index--;
			}
		}
	}

	@Override
	public void totalMoney() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<index;i++) {
			sum+=products[i].getMoney();
		}
		System.out.println("모든 도서의 금액 합계는 "+sum+"입니다");
	}
	
	
}

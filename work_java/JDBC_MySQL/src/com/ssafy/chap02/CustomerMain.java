package com.ssafy.chap02;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBManager man = null;
		man = new DBManager();
//			man.insertCustomer("뚜", 24, "광산구");
//			man.insertCustomer("민날두", 28, "북구");
//			man.insertCustomer("중근", 27, "용산");

		// man.updateCustomer(2, "둘리", 21, "쌍문동");

		// man.deleteCustomer(2);
		CustomerVO c = man.queryCustomerByNum(1);
		System.out.println(c.toString());

//			ArrayList<CustomerVO> list=man.queryCustomer();
//			for(CustomerVO vo:list) {
//				System.out.println(vo.toString());
//			}

	}

}

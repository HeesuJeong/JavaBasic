package edu.ssafy.chap04;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV[] tv=new TV[5];
		TV tv1=new TV(111, "type1", 10000, 10, 10, "평면");
		TV tv2=new TV(122, "LG", 20011, 100, 11, "굴곡");
		TV tv3=new TV(222,"Samsung",222,5,12,"평면");
		TV tv4=new TV(333, "type2", 99999, 300, 10, "평면");
		TV tv5=new TV(999, "type3", 30000, 10, 12, "굴곡");
		//tv[4]=new TV(99999, "test", 0, 0, 0, "test");
		
		tv[0]=tv1;
		tv[1]=tv2;
		tv[2]=tv3;
		tv[3]=tv4;
		tv[4]=tv5;
		
		for (int i = 0; i < tv.length; i++) {
			System.out.println(tv[i].toString());
		}
		
		Refrigerator[] re=new Refrigerator[5];
		
		Refrigerator re1=new Refrigerator(12345, "aaa", 10000, 10, 100);
		Refrigerator re2=new Refrigerator(2000, "bbb", 9999, 5, 90);
		Refrigerator re3=new Refrigerator(9090, "ccc", 98943, 20, 200);
		Refrigerator re4=new Refrigerator(3000, "heesu", 100000, 100, 1000);
		Refrigerator re5=new Refrigerator(91000, "minhae", 30303, 2, 100);
		
		re[0]=re1;
		re[1]=re2;
		re[2]=re3;
		re[3]=re4;
		re[4]=re5;
		
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i].toString());
		}
		
	}

}

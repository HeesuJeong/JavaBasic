package edu.ssafy.chap06;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hello");
		String str2=new String("Hello");
		
		//==는 주소비교
		if(str==str2) {
			System.out.println("no");
		}
		
		if(str.equals(str2)) {
			System.out.println("yes");
		}
		str.toString(); //스트링 자기 자신을 리턴한다.
		
		//문자열과 + 되면 다 문자열로 바뀐다.
		System.out.println(10+str); //일공hello
		System.out.println(7+10+str); //연산자 우선순위로 숫자+숫자 먼저 된다. => 17
		System.out.println(10+'a'+str);//문자는 숫자다 a=7 ************** "a"는 a로 출력돼*******************
	
		
		///////////////////////////////
		String tmp="Hello";
		String tmp2="Hello";
		
		if(tmp==tmp2) {
			System.out.println("헐 같다!");
		}
	}

}

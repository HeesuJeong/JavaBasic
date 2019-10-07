package edu.ssafy.chap07;


//해당 클래스에서 사용할 임의의 타입지정
public class Generic <I>{
	I i;

	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

}

//클래스 이름 뒤에 <타입지정> 안 하면 상속받으니 타입이 I가 아니라 자동으로 Object로 바뀐다.
//클래스 선언시 타입이 결정되는게 아니라, 객체를 만들어 클래스 사용할 때 결정된다 => object에 업캐스팅과 다운캐스팅 응용하는 것이다.
class Sub extends Generic<String>{
	
	//override어노테이션은 사실상 클래스이다 => 오버라이드인지를 감시하는 클래스=>인자,함수명,리턴값이 변경되면 에러로 처리한다.
	@Override
	public void setI(String i) {
		// TODO Auto-generated method stub
		super.setI(i);
	}
	
	@Override
	public String getI() {
		// TODO Auto-generated method stub
		return super.getI();
	}
	
}

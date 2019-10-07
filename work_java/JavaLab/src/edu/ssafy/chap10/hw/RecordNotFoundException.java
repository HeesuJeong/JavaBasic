package edu.ssafy.chap10.hw;

public class RecordNotFoundException extends Exception{

	String msgErr;
	
	public RecordNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public RecordNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		msgErr=msg;
	}
	public void showErr() {
		System.out.println(msgErr);
	}
}

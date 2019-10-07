package edu.ssafy.chap10.hw;

public class DuplicateException extends Exception{

	String msgErr;
	
	public DuplicateException() {
		// TODO Auto-generated constructor stub
	}
	public DuplicateException(String msg) {
		// TODO Auto-generated constructor stub
		msgErr=msg;
	}
	public void showErr() {
		System.out.println(msgErr);
	}
}

package edu.ssafy.chap08;

public class MyDataInputException extends Exception {

	String errmsg;

	public MyDataInputException() {

	}

	public MyDataInputException(String errmsg) {
		this.errmsg=errmsg;
	}

	public void showError() {
		System.out.println(errmsg);
	}

}

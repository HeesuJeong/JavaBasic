package edu.ssafy.chap07.ws;

public class ISBNNotFoundException extends Exception {

	String errmsg;

	public ISBNNotFoundException() {
		super("ISBN 어없다아~");
	}

	public ISBNNotFoundException(String errmsg) {
		this.errmsg=errmsg;
	}
	
	public void showError() {
		System.out.println(errmsg);
	}
}

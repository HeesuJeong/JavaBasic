package edu.ssafy.chap07.ws;

public class QuantityException extends Exception{
	String errmsg;
	
	public QuantityException() {
		
	}
	public QuantityException(String errmsg) {
		this.errmsg=errmsg;
	}
	public void showError() {
		System.out.println(errmsg);
	}
}

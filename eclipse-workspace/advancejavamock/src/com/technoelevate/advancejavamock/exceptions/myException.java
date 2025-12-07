package com.technoelevate.advancejavamock.exceptions;

public class myException extends Exception {

	String msg;

	public myException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "myException [msg=" + msg + "]";
	}
	

}

package com.ruby.java.ch08;

interface Messenger {
	String getMessage();

	void setMessage(String msg);
}

//익명클래스(생략)
/*
class GalaxyMessenger implements Messenger{
	public String getMessage() {
		return "test";
	}

	public void setMessage(String msg) {
		System.out.println("메세지 = : " + msg);
	}

	
}*/

public class MessengerTest {
	public static void main(String[] args) {
		//GalaxyMessenger test = new GalaxyMessenger();
		
		Messenger galaxy = new Messenger() {//인터페이스-익명클래스
			public String getMessage() {
				return "test";
			}

			public void setMessage(String msg) {
				System.out.println("메세지 = : " + msg);
			}

		};
	}
}
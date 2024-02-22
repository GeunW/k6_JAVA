package com.ruby.java.ch07.Interface;

public class MessengerTest {
	public static void main(String[] args) {
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기 : "+Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기 : "+Messenger.MAX_SIZE);
		
		System.out.println();
		
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();
		iphone.fileUpload();
		iphone.fileDownload();
		
		System.out.println();
		
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		galaxy.fileUpload();
		galaxy.fileDownload();
	}
}

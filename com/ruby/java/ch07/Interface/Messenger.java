package com.ruby.java.ch07.Interface;

public interface Messenger {
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	public String getMessage();
	
	public void setMessage(String msg);
	
	public default void setLogin(boolean login) {
		log();
		if(login) {
			System.out.println("로그인 처리합니다.");
		}else {
			System.out.println("로그아웃 처리합니다.");
		}
	}
	
	public static void getConnecction() {
		System.out.println("네트워크에 연결합니다.");
	}
	
	private void log() {
		System.out.println("start job!");
	}
}

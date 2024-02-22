package com.ruby.java.ch07.Interface;

public class IPhoneMessenger implements Messenger, WorkFile {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "iPhon";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("iPhone에서 메시지를 설정합니다 : "+msg);

	}
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}

	@Override
	public void fileUpload() {
		System.out.println("파일을 업로드 합니다.");
	}

	@Override
	public void fileDownload() {
		System.out.println("파일을 다운로드 합니다.");
		
	}

}

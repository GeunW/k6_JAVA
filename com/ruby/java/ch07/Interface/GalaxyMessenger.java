package com.ruby.java.ch07.Interface;

public class GalaxyMessenger implements Messenger, WorkFile {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("galaxy에서 메세지를 설정합니다. : "+msg);
		
	}

	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
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

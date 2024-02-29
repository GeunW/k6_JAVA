package com.ruby.java.ch11;

public class Test05_1 {
	int battery = 0;

	public static void main(String[] args) {

		Test05_1 test = new Test05_1();
		try {
			test.charge(30);
			test.charge(20);
			test.charge(-10);
		} catch (NagativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

//***************************************
	private void charge(int time) throws NagativeNumberException {
		if (time < 0) {
			time = 0;
			throw new NagativeNumberException();

		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}
}

package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		try (FileInputStream fi = new FileInputStream("a.txt")) {
			int c;
			while ((c = fi.read()) != -1) {
				System.out.print((char) c);
				System.out.println(", " + c);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}
}

package com.ruby.java.ch04배열;

import java.util.Random;

public class Test37 {
	public static void main(String[] args) {
		
		Random rnd = new Random(); // random 
		int[] score = new int[20];
		for(int i = 0; i<score.length; i++) {
			
			score[i] = rnd.nextInt(101);
			
		}
		
		for(int num:score){
			System.out.println(num);
		}
		
	}
}

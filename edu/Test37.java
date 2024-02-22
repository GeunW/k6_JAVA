package edu;

import java.util.Random;

public class Test37 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] score = new int[20];
		float sum = 0;
		float avg = 0.0f;
		int max = 0;
		int min = 9999;
		
		for(int i=0; i<score.length; i++) {
			score[i] = rnd.nextInt(101);
			sum += score[i];
			avg = sum/20;
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
				
		for(int num:score) {
			
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println((int)sum);
		System.out.printf("%.1f \n",avg);
		System.out.println(max);
		System.out.println(min);
	}
}

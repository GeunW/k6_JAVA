package com.ruby.java.ch04배열;

import java.util.Random;

public class Test38 {
	public static void main(String[] args) {
		Random rand = new Random();
//		int[][] arr1 = {{1,0},{0,1},{2,2}};
//		int[][] arr2 = {{2,3},{4,5}};
		int[][] arr3 = new int[3][3];
//		System.out.println(arr1.length);
//		System.out.println(arr1[1].length);
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(arr1[i][j]);
//				if(j==1) {
//					System.out.println();
//				}
//			}
//		}
//		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = rand.nextInt(10);
				System.out.print(arr3[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}
}

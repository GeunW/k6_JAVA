package edu;

import java.util.Random;

public class Test38 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] arr3 = new int[3][3];

		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = rand.nextInt(10);
				if(i >= j) {
					System.out.print(arr3[i][j]+"\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
	}
}
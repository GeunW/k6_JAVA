package com.ruby.java.ch04배열;

import java.util.Random;

public class Test38Metrix {
	
	
	
	public static void main(String[] args) {
		//C = A*B
		//E = A+D
		//F = A 전치 행렬
		Random rnd = new Random();
		
		int A[][] = new int [3][4];
		int B[][] = new int [4][5];
		int C[][] = new int [3][5];
		int D[][] = new int [3][4];
		int E[][] = new int [3][4];
		int F[][] = new int [4][3];
		
		System.out.println("A행렬");
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				A[i][j] = rnd.nextInt(10);
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("B행렬");
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				B[i][j] = rnd.nextInt(10);
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("D행렬");
		for(int i=0; i<D.length; i++) {
			for(int j=0; j<D[i].length; j++) {
				D[i][j] = rnd.nextInt(10);
				System.out.print(D[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
//----------------------------------------------------------
		
		//C = A * B				
		System.out.println("C행렬 : 행렬의 곱 (AxB)");		

		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<4; k++) {
				C[i][j] += (int)A[i][k]*B[k][j];
				
				}
			}
		}
		
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				System.out.print(C[i][j]+"\t"); 
			}
			System.out.println();
		}
		System.out.println();

		//E = A + D				
		System.out.println("E행렬 : 행렬의 합 (A+D)");

		for(int i=0; i<E.length; i++) {
			for(int j=0; j<E[i].length; j++) {
				E[i][j] = A[i][j] + D[i][j];
				System.out.print(E[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();

		//F = A의 전치행렬		
		System.out.println("F행렬 : 전치행렬 A(T)");
		for(int i=0; i<F.length; i++) {
			for(int j=0; j<F[i].length; j++) {
				F[i][j] = A[j][i];
				System.out.print(F[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
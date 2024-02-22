package edu;

public class Test38Me {
	public static void main(String[] args) {
		   // 행렬 A: 3x4
        int[][] A = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // 행렬 B: 4x5
        int[][] B = {
            {13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22},
            {23, 24, 25, 26, 27},
            {28, 29, 30, 31, 32}
        };

        // 결과 행렬 C: 3x5
        int[][] C = new int[3][5];

        // 행렬 곱셈 수행
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
	}
}

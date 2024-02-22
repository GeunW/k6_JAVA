package practice;

import java.util.Random;

/*
 * 클래스 메소드 구현 실습 목적
 */
class Matrix {
    int rows;
    int cols;
    int[] data;

    public Matrix(int rows, int cols) {
        Random rnd = new Random();

        this.rows = rows;
        this.cols = cols;
        data = new int[rows * cols];

        // 행렬 데이터 랜덤 초기화
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                data[i * this.cols + j] = rnd.nextInt(10);
            }
        }
    }

    // getData 메소드는 더 이상 사용되지 않으므로 제거

    // 두 행렬을 더하는 메소드
    Matrix addMatrix(Matrix b) {
        Matrix m = new Matrix(this.rows, this.cols);

        // 덧셈 연산을 수행하고 결과를 새로운 행렬에 저장
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                m.data[i * this.cols + j] = this.data[i * this.cols + j] + b.data[i * this.cols + j];
            }
        }
        return m;
    }

    // 두 행렬을 곱하는 메소드
    Matrix multiplyMatrix(Matrix b) {
        Matrix m = new Matrix(this.rows, b.cols);

        // 곱셈 연산을 수행하고 결과를 새로운 행렬에 저장
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    m.data[i * b.cols + j] += this.data[i * this.cols + k] * b.data[k * b.cols + j];
                }
            }
        }
        return m;
    }

    // 행렬을 전치하는 메소드
    Matrix transposeMatrix() {
        Matrix m = new Matrix(this.cols, this.rows);

        // 전치 연산을 수행하고 결과를 새로운 행렬에 저장
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                m.data[j * this.rows + i] = this.data[i * this.cols + j];
            }
        }
        return m;
    }

    // 행렬을 2차원 배열 모양으로 출력하는 메소드
    void showMatrix(String str) {
        System.out.println(str);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(data[i * this.cols + j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class Test02 {

    public static void main(String[] args) {
        Matrix B = new Matrix(3, 4);
        Matrix C = new Matrix(3, 4);
        Matrix A, D, F;
        Matrix E = new Matrix(4, 5);

        System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");

        B.showMatrix("B[3][4]");
        C.showMatrix("C[3][4]");

        A = B.addMatrix(C);
        A.showMatrix("A[3][4]");

        System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");

        B.showMatrix("B[3][4]");
        E.showMatrix("E[4][5]");

        D = B.multiplyMatrix(E);
        D.showMatrix("D[3][5]");

        System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");

        B.showMatrix("B[3][4]");
        F = B.transposeMatrix();
        F.showMatrix("F[4][3]");
    }
}
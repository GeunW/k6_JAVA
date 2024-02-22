package practice;

public class Practice02 {
	int[][] mtr1 = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
	};
	
	int[][] mtr2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
	};
	
	int[][] mtr3 = new int[3][3];
	
	public void multiple() {
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				for(int k =0; k<4; k++) {
					mtr3[i][j] += (int)mtr1[i][k]*mtr2[k][j];
				}
			}
		}
	}
	
	public void print() {
		for(int i=0; i<3; i++) {
			for(int j =0; j<3; j++) {
				System.out.print(mtr3[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Practice02 t1 = new Practice02();
		t1.multiple();
		t1.print();
	}
	
	
}

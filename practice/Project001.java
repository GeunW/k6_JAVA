package practice;

import java.util.Scanner;

public class Project001 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = 999;
		
		

		do {
			System.out.println("2g, 3g, 5g 하나 이상씩 사용하여 입력값을 만족하세요.[범위:10~100, 마치려면 0을 입력하세요]");
			System.out.print("입력 값 : ");
			input = scanner.nextInt();
			int target = input - 10;

			for (int i = 1; i < 10; i++) {
				if(target > 2) {
					target = target - (i*2);
				}
				for (int j = 1; j < 10; j++) {
					if(target > 3) {
						target = target - (j*3);
					}
					for (int k = 1; k < 10; k++) {
						if(target > 5) {
							target = target - (k*5);
						}
			
						if (target == 0) {
							System.out.printf("(%d,%d,%d) ",i+1,j+1,k+1);
							
						}
					}
				}
			}

		} while (input != 0);

	}
}

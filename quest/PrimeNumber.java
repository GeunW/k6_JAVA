package quest;

import java.util.Scanner;

public class PrimeNumber {
//**********************************************************	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수를 입력하세요");
		int a = scanner.nextInt();
		isPrime(a);
		System.out.println("끝");
	}

//******************************************************	
	public static int isPrime(int number) {
		int s = (int) Math.pow(10, number - 1);
		int e = (int) Math.pow(10, number) - 1;

		for (int i = s; i < e; i++) {
			if (i < 2) {
				
			}
			for (int j = 2; j <= Math.sqrt(number); j++) {
				if (i % j == 0) {

				}

			}
			System.out.println(i);
		}
	}

}

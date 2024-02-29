package quest;

import java.util.Scanner;

public class GugudanTest {
	public static void main(String[] args) {
		Gugudan ggd = new Gugudan();

		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("원하는 단을 입력하세요? ");
			System.out.print("(0을 입력하면 종료됩니다.)");
			ggd.print(scanner.nextInt());
			System.out.println("-".repeat(15));
		}while(scanner.nextInt() != 0);
		System.out.println("End");
	}
}


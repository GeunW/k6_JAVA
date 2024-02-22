package practice;

import java.util.Scanner;

public class Practice01 {

	public static void cal() {
		Scanner scanner = new Scanner(System.in);
		int input = 999;
		do {
			System.out.println("2g, 3g, 5g 하나 이상씩 사용하여 입력값을 만족하세요.[범위:10~100, 마치려면 0을 입력하세요]");
			System.out.print("입력 값 : ");
			input = scanner.nextInt();

			if (9 < input && input < 100) {
				int target = input - 10;
				int count1 = 1;
				int count2 = 1;
				int count3 = 1;
				if (target != 1) {
					while (target % 2 == 0) {
						target = target / 2;
						count1 = count1 + 1;
					}

					while (target % 3 == 0) {
						target = target / 3;
						count2 = count2 + 1;
					}
					while (target % 5 == 0) {
						target = target / 5;
						count3 = count3 + 1;
					}

					if (target == 1) {
						System.out.println("(" + count1 + "," + count2 + "," + count3 + ")");
					} else {
						System.out.println("무게가 남습니다.");
					}
				} else {
					System.out.println("무게가 남습니다.");
				}
			} else {
				System.out.println("범위를 초과하였습니다.");
			}
		} while (input != 0);

	}

	public static void main(String[] args) {

		cal();
		System.out.println("끝!");
	}
}

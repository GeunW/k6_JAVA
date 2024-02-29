package quest;

public class Gugudan2 {

	public void printColumn(int a) {
		 
		
		
		int col = a;
		
		for (int i = 1; i < a; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 2; k < 10; k++) {
					System.out.printf("%d * %d = %d \t", k, i, k * i);
					// System.out.print(i + "*" + j + "=" + i * j + "\n");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}

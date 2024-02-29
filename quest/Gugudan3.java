package quest;

public class Gugudan3 {

	public void printColumn(int a) {
		for (int i = 1; i < 2; i++) {

			for (int j = 2; j < 10; i++) {
				System.out.printf(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}
package quest;

public class Gugudan {

	public void print(int i) {
		System.out.println(i + "단");
		int gab;
		for (int j = 1; j < 10; j++) {
			gab = i * j;
			System.out.println(i + " x " + j + " = " + gab);
		}

	}

	public void print2() {
		int jj = 0;
		int gab = 0;
		for (int i = 1; i < 10; i++) {

			for (int j = 1; j < 10; j++) {
				jj = j;
				gab = i * j;

			}
			System.out.println(i + " x " + jj + " = " + gab);
		}

	}

}

import java.util.Scanner;

public class Zavd_5 {

	public static void main(String[] args) {
		float[] a = new float[10];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Введіть " + (i + 1) + "-й елемент");
			a[i] = inp.nextFloat();
		}
		float temp;

		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Після бульбашкового сортування");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		inp.close();
	}

}
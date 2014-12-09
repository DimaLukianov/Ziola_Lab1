import java.util.Scanner;

public class Zavd_4 {

	public static void main(String[] args) {
		float[] a = new float[10];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Введіть " + (i + 1) + "-й елемент");
			a[i] = inp.nextFloat();
		}
		int min;
		float temp;

		for (int index = 0; index < a.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < a.length; scan++)
				if (a[scan] < a[min])
					min = scan;

			temp = a[min];
			a[min] = a[index];
			a[index] = temp;
		}
		System.out.println("Після  сортування вибором");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		inp.close();
	}

}
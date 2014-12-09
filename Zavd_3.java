import java.util.Scanner;

public class Zavd_3 {

	public static void main(String[] args) {
		float[] a = new float[10];
		float tmp;
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Введіть " + (i + 1) + "-й елемент");
			a[i] = inp.nextFloat();
		}
		for (int i = 1; i < a.length; i++)
			for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
				tmp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = tmp;
			}
		System.out.println("Після  сортування вставками");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		inp.close();
	}

}

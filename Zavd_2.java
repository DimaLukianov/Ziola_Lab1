import java.util.Scanner;

public class Zavd_2 {

	public static void main(String[] args) {
		float[] a = new float[10];
		float x;
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("������ " + (i + 1) + "-� �������");
			a[i] = inp.nextFloat();
		}
		System.out.println("������ X");
		x = inp.nextFloat();
		System.out.println("ϳ������� �� ������:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > x)
				System.out.print(a[i] + " ");
		}
		inp.close();
	}

}

import java.util.Scanner;
import java.lang.Math;

public class Rivnyannya {

	public static void main(String[] args) {
		System.out.println("Введіть a");
		Scanner br = new Scanner(System.in);
		double x1, x2;
		double a = br.nextDouble();
		System.out.println("Введіть b");
		double b = br.nextDouble();
		System.out.println("Введіть c");
		double c = br.nextDouble();
		double d = b * b - 4 * a * c;
		if (d < 0)
			System.out.println("Рівняння не має розвязків");
		else if (d == 0) {
			x1=-b/(2*a);
			System.out.println("Рівняння має 1 розвязок, x = " + x1);
		} else 
		{
			x1=(-b-Math.sqrt(d))/(2*a);
			x2=(-b+Math.sqrt(d))/(2*a);
			System.out.format("Рівняння має 2 розвязки, x1 = %6.4f,"+" x2 = %6.4f",x1,x2);
		}
		br.close();

	}
}

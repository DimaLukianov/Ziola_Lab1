import java.util.Scanner;
import java.lang.Math;

public class Rivnyannya {

	public static void main(String[] args) {
		System.out.println("������ a");
		Scanner br = new Scanner(System.in);
		double x1, x2;
		double a = br.nextDouble();
		System.out.println("������ b");
		double b = br.nextDouble();
		System.out.println("������ c");
		double c = br.nextDouble();
		double d = b * b - 4 * a * c;
		if (d < 0)
			System.out.println("г������ �� �� ��������");
		else if (d == 0) {
			x1=-b/(2*a);
			System.out.println("г������ �� 1 ��������, x = " + x1);
		} else 
		{
			x1=(-b-Math.sqrt(d))/(2*a);
			x2=(-b+Math.sqrt(d))/(2*a);
			System.out.format("г������ �� 2 ��������, x1 = %6.4f,"+" x2 = %6.4f",x1,x2);
		}
		br.close();

	}
}

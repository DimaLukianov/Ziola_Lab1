import java.util.Random;

public class Zavd_6 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int sum =0;
		Random rand = new Random();
		for (int i = 0; i <5; i++)
			for (int j = 0; j<5; j++) 
					a[i][j] = rand.nextInt(20);
			
		System.out.println("Масив:");
		for (int i = 0; i < 5; i++){
			for (int j = 0; j <5; j++) 
				{
					System.out.print(a[i][j] +"\t");
				}
				System.out.println();
			}
		for (int i = 0; i < 5; i++)
			for (int j = 0; j <5; j++) 
				if (i>j) sum +=a[i][j];
		
		System.out.println("Сума елементів під нижньою діагоналлю становить - "+ sum);
	}

}

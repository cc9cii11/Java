import java.util.Scanner;

public class evenProduct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] product = new int[5];
		int result = 0;
		
		for(int x = 0; x < product.length; x++) {
			System.out.println("Please enter numbers");
			product[x] = input.nextInt();
		}

		outerloop:
		for (int p = 0; p < product.length;) {
			for (int i = (p + 1); i < product.length; i++) {
				result = (product[p] * product[i]);
				if ((result % 2 == 0)) {
					System.out.println(result + " Yes there is a pair ");
					break outerloop;
				} 
			}
			p++;
		}
	}
}

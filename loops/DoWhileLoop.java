package loops;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		int sum = 0,n;
		Scanner sc = new Scanner(System.in) ;
		//printing the sum of all input numbers until the input is less than zero
		do {
			//do while repeats until the input number is negative
			System.out.println("Enter the number");
			 n = sc.nextInt();
			sum+=n;
		} while (n>=0);
		System.out.println("The sum of the numbers is "+sum);

	}

}

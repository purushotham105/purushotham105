package loops;
import java.util.Scanner;
public class DoWhileLoopPrintingNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int n = 1;
		System.out.print("The numbers are ");
		do {
			System.out.print(n+" ");
			n++;
		} while (n<=number);

	}

}

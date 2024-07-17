import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num=obj.nextInt();
		
		int a = 1,f = 1;

		while (a<=num) {
			f=f*a;
			a++;
		}
		System.out.println("Factorial of Number : "+f);
	}
}

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find fac: ");
		int n = sc.nextInt();
		int fac = 1;
		
		for(int i=1; i<=n; i++) {
			fac = fac*i;
		}
		System.out.println(fac);
	}
}

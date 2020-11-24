
public class FactorialRecursion {
	public static void main(String[] args) {
		int n = 5; 
		int result = findFactorial(n);
		System.out.println(result);
	}

	private static int findFactorial(int n) {
		if(n<=1)
			return 1;
		else
			return n * findFactorial(n-1);
	}
}

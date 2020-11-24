
public class PrimeNumber {
	public static void main(String[] args) {
		int n=221;
		boolean flag= false;
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				flag = true;
			}
		}
		if(flag) 
			System.out.println("not prime");
		else 
			System.out.println("prime");
	}
}


public class SumOfDigitsofNumber {
	public static void main(String[] args) {
		int number = 2019;
		int temp = number;
		int sum = 0;
		while(temp != 0) {
			int rem = temp%10;
			sum = sum+rem;
			temp = temp/10;
		}
		System.out.println(sum);
	}
}

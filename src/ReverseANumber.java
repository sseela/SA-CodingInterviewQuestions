
public class ReverseANumber {
	public static void main(String[] args) {
		int number = 2019;
		int temp = number;
		int result = 0;
		while(temp != 0) {
			int rem = temp%10;
			result = 10*result + rem;
			temp = temp/10;
		}
		System.out.println(result);
	}
}

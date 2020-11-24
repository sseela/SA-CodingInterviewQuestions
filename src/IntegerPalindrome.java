
public class IntegerPalindrome {
	public static void main(String[] args) {
		int number = 1001;
		int temp = number;
		int rev = 0;
		while(temp != 0) {
			int remainder = temp % 10;
			rev = rev*10 + remainder;
			temp = temp/10;
		}
		if(number == rev) {
			System.out.println("palindrome");
		} else 
			System.out.println("not palindrome");
	}
}

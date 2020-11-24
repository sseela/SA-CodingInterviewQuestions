
public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 232;
		int temp = number;
		int result = 0;
		while(temp != 0) {
			int remainder = temp % 10;
			result = result + remainder*remainder*remainder;
			temp = temp/10;
		}
		if(result == number) {
			System.out.println("armstrong");
		} else
			System.out.println("not");
	}
}

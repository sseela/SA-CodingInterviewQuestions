
public class PerfectNumberOrNot {
	public static void main(String[] args) {
		int number = 8128;
		int sum = 0;
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				sum = sum+i;
			}
		}
		if(number == sum) {
			System.out.println("perfect");
		}
		else 
			System.out.println("not");
	}
}

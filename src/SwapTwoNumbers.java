
public class SwapTwoNumbers {
	public static void main(String[] args) {
		int n1 = -10;
		int n2 = 20;
		
		withTemp(n1, n2);
		withoutTemp(n1, n2);
	}

	private static void withTemp(int n1, int n2) {
		int temp = 0;
		temp = n2;
		n2 = n1;
		n1 = temp;
		System.out.println(n1+" "+n2);
	}
	
	private static void withoutTemp(int n1, int n2) {
		int n3=0;
		n3 = n1+n2;
		n2 = n3-n2;
		n1 = n3-n1;
		System.out.println(n1+" "+n2);
	}
}

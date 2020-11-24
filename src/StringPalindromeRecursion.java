
public class StringPalindromeRecursion {
	public static void main(String[] args) {
		String str = "bbbb";
		String rev = reverse(str);
		if(str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("palindrome");
		} else 
			System.out.println("not palindrome");
		
	}

	private static String reverse(String str) {
		if(str.isEmpty())
			return str;
		else 
			return reverse(str.substring(1))+str.charAt(0);
	}
}


public class StringPalindrome {
	public static void main(String[] args) {
		String str = "Bob";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		if(rev.toLowerCase().equals(str.toLowerCase())) {
			System.out.println("palindrome");
		} else 
			System.out.println("not palindrome");
	}
}

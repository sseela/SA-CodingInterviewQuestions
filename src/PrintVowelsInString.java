import java.util.Collection;

public class PrintVowelsInString {
	public static void main(String[] args) {
		String str = "sandeep";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				System.out.println(str.charAt(i)+" ");
			}
		}
	}
}

abstract class AB {
	int b=10;
	static void m8() {}
	public abstract void m1();
	void m2() {}
	protected void m3() {}
	private void m4() {}
}
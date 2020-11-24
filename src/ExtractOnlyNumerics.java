
public class ExtractOnlyNumerics {
	public static void main(String[] args) {
		String str = "abc123def456";
		String res = "";
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(Character.isDigit(arr[i])) {
				res = res + arr[i];
			}
		}
		System.out.println(res);
	}
}

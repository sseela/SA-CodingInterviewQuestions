import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40};
		int n = array.length;
		int[] res = new int[n];
		for(int i=0; i<array.length; i++) {
			res[n-1] = array[i];
			n = n-1;
		}
		System.out.println(Arrays.toString(res));
	}
}

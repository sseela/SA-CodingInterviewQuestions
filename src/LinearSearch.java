
public class LinearSearch {
	public static void main(String[] args) {
		int target = 4;
		int[] arr = {2, 13, 43, 4, 2};
		usingLinearSearch(arr, target);
	}

	private static void usingLinearSearch(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				System.out.println(i);
			}
		}
	}
}

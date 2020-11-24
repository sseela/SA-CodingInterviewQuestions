
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int target = 12;
		int res = usingBinarySearch(arr, 0, arr.length-1, target);
		System.out.println(res);
	}

	private static int usingBinarySearch(int[] arr, int begin, int end, int target) {
		
		if(end >= begin) {
			int midpoint = begin + (end-begin)/2;
			if(target == arr[midpoint]) {
				return midpoint;
			} 
			if(target > arr[midpoint]) {
				return usingBinarySearch(arr, midpoint+1, end, target);
			}
			if(target < arr[midpoint]) {
				return usingBinarySearch(arr, begin, midpoint-1, target);
			}
		}
		return -1;
	}
}

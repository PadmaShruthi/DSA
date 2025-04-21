package searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {3,4,22,23,84};
		int len = arr.length;
		int target = 22;
		int index = binarySearch(arr, 0, len-1, target);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int low, int high, int target) {
		// TODO Auto-generated method stub
		if(low > high) return -1;
		int mid = (low+high)/2;
		if(arr[mid] == target) return mid;
		else if (target > arr[mid]) return binarySearch(arr, mid+1, high, target);
		else return binarySearch(arr, low, mid-1, target);
	}
}

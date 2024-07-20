package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {3,43,2,11,23,4};
		int len = arr.length;
		insertionSort(arr, len);
		display(arr, len);
	}
	private static void insertionSort(int[] arr, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= len-1; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
	private static void display(int[] arr, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "|");
		}
	}
}

package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3,43,2,11,23,4};
		int len = arr.length;
		bubbleSort(arr, len);
		display(arr, len);
	}
	
	private static void bubbleSort(int[] arr, int len) {
		// TODO Auto-generated method stub
		
		for (int i = len-1; i >= 0; i--) {
			for (int j = 0; j <= i-1; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		
	}

	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
	}

	private static void display(int[] arr, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "|");
		}
	}
	
	
}

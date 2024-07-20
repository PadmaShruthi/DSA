package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3,43,2,11,23,4};
		int len = arr.length;
		selectionSort(arr, len);
		display(arr, len);
	}

	private static void display(int[] arr, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "|");
		}
	}

	private static void selectionSort(int[] arr, int len) {
		
		for(int i = 0; i < len-1; i++) {
			int min = i;
			for (int j = i+1; j < len; j++) {
				if (arr[j]<arr[min]) {
					min = j;
				}
			}
			//swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

}

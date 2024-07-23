package sorting;

public class QuickSort {
 public static void main(String[] args) {
	 int[] arr = {3,43,2,11,23,4};
		int len = arr.length;
		quickSort(arr, 0, len-1);
		display(arr, len);
}
 
 private static void quickSort(int[] arr, int low, int high) {
	// TODO Auto-generated method stub
	 if ( low < high) {
		 int part = partition(arr, low, high);
		 quickSort(arr, low, part-1);
		 quickSort(arr, part+1, high);
	 }
}

private static int partition(int[] arr, int low, int high) {
	// TODO Auto-generated method stub
	int pivot = low;
	int i = low; 
	int j = high;
	while(i < j) {
		while (arr[i] <= arr[pivot] && i <= high - 1) {
			i++;
		}
		while (arr[j] > arr[pivot] && j >= low + 1) {
			j--;
		}
		if(i < j) {
			swap(arr, i, j);
		}
	}
	swap (arr, low, j);
	return j;
}
private static void swap(int[] arr, int i, int j) {
	// TODO Auto-generated method stub
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
private static void display(int[] arr, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "|");
		}
	}
}

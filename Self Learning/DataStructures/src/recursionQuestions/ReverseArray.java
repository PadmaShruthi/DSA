package recursionQuestions;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		reverseArray(arr, 0, arr.length - 1);
		display(arr);
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverseArray(int[] arr, int start, int end) {
		if(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArray(arr, start+1, end-1);
		}
	}
}

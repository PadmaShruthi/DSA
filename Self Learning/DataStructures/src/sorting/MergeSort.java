package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {3,43,2,11,23,4};
		int len = arr.length;
		mergeSort(arr, 0, len-1);
		display(arr, len);
	}

	private static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if (low >= high) return;
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr,low,mid,high);
	}


	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		List<Integer> temp = new ArrayList<Integer>();
		int left = low;
		int right = mid+1;
		
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		
		// transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
	}

	private static void display(int[] arr, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "|");
		}
	}
}

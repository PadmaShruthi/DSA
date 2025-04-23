package arrayQuestions;

import java.util.Arrays;

public class MergeSortedArrays {
	public static void main(String[] args) {
        MergeSortedArrays arrays = new MergeSortedArrays();
        int[] arr3 = arrays.mergeArrays(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30});
        System.out.println(Arrays.toString(arr3));

    }

	private int[] mergeArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] mergedArray = new int[arr1.length+arr2.length];
		int i = 0, j = 0, k= 0;
		//until when the i value is less than the 1st arr and j index is less then 2nd arr
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			}else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		//at this point any one array will be pending so check for both arrays if it has remaining elements
		// 1st array check
		while(i < arr1.length) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		
		//2nd array check
		while(j < arr2.length) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		return mergedArray;
	}
	
	
}

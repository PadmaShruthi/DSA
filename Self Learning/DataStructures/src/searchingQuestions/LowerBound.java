package searchingQuestions;

public class LowerBound {
	public static void main(String[] args) {
		int[] arr = {3,4,22,23,84};
		int len = arr.length;
		int element = 24;
		System.out.println(lowerBound(arr, 0, len, element));
	}
//smallest index such that the arr[ind]>=element
	private static int lowerBound(int[] arr, int low, int len, int element) {
		// TODO Auto-generated method stub
		int high = len-1;
		int ans = len;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] >= element) {
				ans = mid;
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return ans;
	}
}

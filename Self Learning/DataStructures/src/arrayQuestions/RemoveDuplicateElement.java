package arrayQuestions;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		int[] nums = {1,1,2,3,4,4};
		int[] newArr = removeDuplicateElement(nums);
		display(newArr, newArr.length);
	}

	private static int[] removeDuplicateElement(int[] nums) {
		// TODO Auto-generated method stub
		int[] temp = new int[nums.length];
		int j = 0;
		for(int i = 0; i < nums.length-1; i++) {
			if (nums[i] != nums[i+1]) {
				temp[j++] = nums[i];
			}
		}
		temp[j++] = nums[nums.length - 1];
		return temp;
	}
	
	private static void display(int[] arr, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "|");
		}
	}
}

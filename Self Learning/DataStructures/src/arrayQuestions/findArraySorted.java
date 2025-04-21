package arrayQuestions;

public class findArraySorted {
	 public static void main(String[] args) {
		int[] nums = {3,4,5,1,2};
		System.out.println(check(nums));
	}
	 
	 public static boolean check(int[] nums) {
	     for (int i = 0; i < nums.length - 1; i++){
	             if(nums[i] > nums[i+1]){
	                 return false;
	             }
	     }
	     return true;
	 }
}

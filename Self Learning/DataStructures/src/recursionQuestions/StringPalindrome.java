package recursionQuestions;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "ABCBAR";
		System.out.println(palindrome(0, s));
	}

	private static Boolean palindrome(int i, String s) {
		// TODO Auto-generated method stub
		if (i > (s.length())/2) return true; // if the i crosses half the length of array, means all the chars are compared, return true
		
		if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		
		return palindrome(i+1, s); // move fwd if the chars matched
	}
}

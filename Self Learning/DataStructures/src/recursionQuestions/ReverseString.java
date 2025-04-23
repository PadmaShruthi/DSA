package recursionQuestions;

public class ReverseString {
	 public String reverseStringRecursive(String string) {
	        if (string.equals("")) {
	            return "";
	        }
	        return reverseStringRecursive(string.substring(1)) + string.charAt(0);
	    }
	 
	 public static void main(String[] args) {
	        ReverseString reverse = new ReverseString();
	        System.out.println(reverse.reverseStringRecursive("yoyo mastery"));
	    }
}

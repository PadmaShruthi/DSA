package recursionQuestions;

public class FibonacciNumbers {
	public static void main(String[] args) {
		int ans = fiboNum(6);
		System.out.println(ans);
	}

	private static int fiboNum(int n) {
		if (n <= 1) {
			return n;
		}
		return (fiboNum(n - 1) + fiboNum(n - 2));
	}
}

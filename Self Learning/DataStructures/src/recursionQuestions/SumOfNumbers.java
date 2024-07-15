package recursionQuestions;

public class SumOfNumbers {
	public static void main(String[] args) {
		System.out.println(sumOfNumbers(5));
		sumOfNumbers(5,0);
	}

	//method 1 - functional
	private static int sumOfNumbers(int N) {
		// TODO Auto-generated method stub
		if( N == 0) return 0;
		return N + sumOfNumbers(N-1);
	}
	
	// method 2 - parameterized
	private static void sumOfNumbers(int N, int sum) {
		// TODO Auto-generated method stub
		if(N < 1) {
			System.out.println(sum);
			return;
		}
		
		sumOfNumbers(N-1, sum+N);
	}
}

package recursionQuestions;

public class FactorialNumbers {
	public static void main(String[] args) {
		System.out.println(factorialNum(5));
		System.out.println(factorialNum(4));
	}

	private static int factorialNum(int i) {
		// TODO Auto-generated method stub
		if ( i == 1) return 1;
		
		return i * factorialNum(i-1);
	}
}

package recursionQuestions;

public class PrintNumbersNto1 {
	//method 1
//	public static void printNumbers(int i, int N) {
//		if(i > N) {
//			return;
//		}
//		printNumbers(i+1, N);
//		System.out.println(i);
//	}
	
	//method 2
	public static void printNumbers(int i, int N) {
		if(i < 1) {
			return;
		}
		System.out.println(i);
		printNumbers(i-1, N);
	}
	public static void main(String[] args) {
		//printNumbers(1,4);
		printNumbers(4,4);
	}
}

package hw2;

/**
 * Compute fibonacci number using tail recursion.
 * @author Pasut Kittiprapas
 *
 */
public class Problem4 {
	
	static long fibonacci(long num) {
		return fibonacciHelper(num, 0, 1);
	}

	static long fibonacciHelper(long num, long start, long next) {
		if(num == 0) return start;
		if(num == 1) return next;
		else return fibonacciHelper(num - 1, next, start+next);
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(50));
		System.out.println(fibonacci(70));
		System.out.println(fibonacci(100));
		
	}
}

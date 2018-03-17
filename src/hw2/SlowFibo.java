package hw2;

/**
 * Test fibonacci with normal recursive.
 * @author Pasut Kittiprapas
 *
 */
public class SlowFibo {
	
	public static long fibonacci(int n) {
		 // the base case
		 if (n < 2) return 1;
		 // the recursive step
		 return fibonacci(n-1) + fibonacci(n-2);
		}

	public static void main(String[] args) {
		System.out.println(fibonacci(20));
		System.out.println(fibonacci(50));
	}
	
}

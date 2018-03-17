package hw2;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List<?> unique(List<?> list) {
		if (list.size() == 1)
			return list;
		List<?> subList = list.subList(1, list.size());
		if (list.get(0) == list.get(1)) {
			subList.remove(0);
			unique(list);
		} else {
			unique(subList);
		}
		return list;
	}

	/**
	 * Print item in the list.
	 * 
	 * @param list
	 * 
	 */
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.print(o);
		}
	}

	/**
	 * Use fibonacciHelper method to return the value of fibo number
	 * 
	 * @param num
	 *            numth of the fibonacci number that want to know value.
	 * @return value of fibonacci numbers
	 */
	static long fibonacci(int num) {
		return fibonacciHelper(num, 0, 1);
	}

	/**
	 * Compute fibonacci number
	 * 
	 * @param num
	 *            nth of the fibonacci that we want to know
	 * @param start
	 *            begin index
	 * @param next
	 *            next index
	 * @return value of fibonacci number
	 */
	static long fibonacciHelper(int num, long start, long next) {
		if (num == 0)
			return start;
		if (num == 1)
			return next;
		else
			return fibonacciHelper(num - 1, next, start + next);
	}

	/**
	 * Test all the method
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");

		System.out.println("Problem3");
		printList(list);
		System.out.println();
		printList(unique(list));

		System.out.println("\n----------------------------");
		System.out.println("Problem4");

		System.out.println(fibonacci(1));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(50));
		System.out.println(fibonacci(70));
		System.out.println(fibonacci(100));

	}
}

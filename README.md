## Explanation

A simple recursive function for this is:

```
public static long fibonacci(int n) {
 // the base case
 if (n < 2) return 1;
 // the recursive step
 return fibonacci(n-1) + fibonacci(n-2);
}
```

This code is slow because every time the ```fibonacci``` method is call, it always recur 2 more ```fibonacci``` method. For example,  ```fibonacci(10)```, it will call ```fibonacci(9)``` + ```fibonacci(8)``` ... and so on until finish. This recursive it use runtime of BigO = ```O(2^n)```.

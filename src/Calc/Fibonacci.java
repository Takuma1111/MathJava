package Calc;

//フィボナッチ数列は 0、1 で始まり、以後の項がその前の2つの項の和となる数列。
//配列は使用しないで書く
public class Fibonacci {
	public long result(int num) {
		if(num == 1) { return 1; }
		long fib = 0;
		long fib_0 = 0;
		long fib_1 = 1;
		for(int i = 2; i <= num; i++) {		
			fib = fib_0 + fib_1;
			fib_0 = fib_1;
			fib_1 = fib;
		}
		return fib;
	}
}

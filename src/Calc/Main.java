package Calc;

public class Main {

	public static void main(String[] args) {
		
		//50までのトリボナッチ数を求める
		TribonacciSequence tri = new TribonacciSequence();
		for(int i = 0; i <= 50; i++) {
			System.out.println(i + ":" + tri.result(i));
		}
		
		//50までのフィボナッチ数列を求める
		Fibonacci fib = new Fibonacci();
		for(int i = 1; i <= 50; i++) {
			System.out.println(i + ":" + fib.result(i));
		}
		
		//再帰関数を使用してフィボナッチ数列を求める
		recursiveFibonacci fib2 = new recursiveFibonacci();
		for(int i = 1; i <= 50; i++) {
			System.out.println("fib2" + ":" + i + ":" + fib2.reFibo(i));
		}
	}
}

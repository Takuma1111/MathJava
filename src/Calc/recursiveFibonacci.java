package Calc;

public class recursiveFibonacci {
	
		public long reFibo(int num) {
			return fibo2(0,0,1,num);
		}
		
		public long fibo2(long a, long b, long c, long d) {
			if(d < 2) {
				return a;
			}
			return fibo2(a + b + c,a,b , d - 1);
		}
}

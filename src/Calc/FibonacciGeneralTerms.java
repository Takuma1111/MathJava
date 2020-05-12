package Calc;
//フィボナッチ数列の一般項を用いて解を求める
//https://ja.wikipedia.org/wiki/%E3%83%95%E3%82%A3%E3%83%9C%E3%83%8A%E3%83%83%E3%83%81%E6%95%B0#%E3%83%97%E3%83%AD%E3%82%B0%E3%83%A9%E3%83%9F%E3%83%B3%E3%82%B0%E8%A8%80%E8%AA%9E%E3%81%A7%E3%81%AE%E5%AE%9F%E8%A3%85
public class FibonacciGeneralTerms {
	public long fiboGeneral(int num) {
		return Math.round(Math.pow((1 + Math.sqrt(5)) / 2, num) + Math.pow((1 - Math.sqrt(5)) / 2, num));
	}
}

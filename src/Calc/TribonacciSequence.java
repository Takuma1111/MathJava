package Calc;

//本コードはトリボナッチ数列について練習として書く。
//トリボナッチ数列は0,0,1で始まり以後の項がその前の3つの項の和となる数列である。
//今回は配列を用いずにコードを書いていく。
public class TribonacciSequence {

	
	public long result(int num){
		if (num == 0 || num == 1) {
			return 0;
		}
		if(num == 2) {
			return 1;
		}
		long tri = 0;	//結果
		long tri_0 = 0;	//三つ前の項の値を格納
		long tri_1 = 0;	//二つ前の項の値を格納
		long tri_2 = 1;	//一つ前の項の値を格納
		
		for(int i = 3; i <= num; i++) {
			tri = tri_0 + tri_1 + tri_2;
			tri_0 = tri_1;
			tri_1 = tri_2;
			tri_2 = tri;
		}
		return tri;
	}
}

package com.example.demo;

import java.util.Arrays;
import java.util.Collections;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		System.out.println(one(5,10));
		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		System.out.println(two("しんぶんし"));
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		System.out.println(Arrays.toString(g(i)));
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		System.out.println(j(k));
	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int one(int a,int b) {
		int c = a + b;
		return c;
	}
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static String two(String d) {
		StringBuilder e = new StringBuilder(d);
		boolean f = d.equals(e.reverse().toString());
		if(f) {
            return ("true");
        } else {
            return ("false");
        }
	}
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static Integer[] g(Integer[] h) {		
		Arrays.sort(h, Collections.reverseOrder());
		return h;
	}
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int j(int[] l) {
		int min = l[0];
		for(int i = 1;i<l.length;i++) {
			if(min > l[i]) {
				min = l[i];
			}
		}
		int n = Arrays.binarySearch(l, min);
		return n;
	}
	
}



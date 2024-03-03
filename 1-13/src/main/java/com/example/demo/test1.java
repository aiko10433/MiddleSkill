package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		//		例）
		//		for() {
		//			for() {
		//				for() {
		//					
		//				}
		//			}
		//		}
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(
				Arrays.asList("f", "u", "k", "u", "d", "a", "k", "a", "n", "e", "k", "o"));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();

		for (int i = 0; i < strArray1.size(); i++) {
			if (i < 2) {
				continue;
			}
			strArray2.add(strArray1.get(i));

			for (int j = 0; j < strArray2.size(); j++) {
				if (i - 2 > j) {
					continue;
				}
				if (strArray2.get(j).equals("k") ||
						strArray2.get(j).equals("a") ||
						strArray2.get(j).equals("o")) {
					strArray3.add(strArray2.get(j));
				}
				if (i + 1 < strArray1.size()) {
					continue;
				}
				for (int l = 0; l < 2; l++) {
					for (int m = 0; m < strArray3.size(); m++) {
						if (strArray3.get(m).equals("k")) {
							strArray4.add(strArray3.get(m));
							break;
						}
					}
					for (int m = 0; m < strArray3.size(); m++) {
						if (strArray3.get(m).equals("a")) {
							strArray4.add(strArray3.get(m));
							break;
						}
					}
				}
				for (int m = 0; m < strArray3.size(); m++) {
					if (strArray3.get(m).equals("o")) {
						strArray4.add(strArray3.get(m));
						break;
					}
				}
				for (int k = 0; k < strArray4.size(); k++) {
					System.out.print(strArray4.get(k));
				}
			}
		}
	}
}

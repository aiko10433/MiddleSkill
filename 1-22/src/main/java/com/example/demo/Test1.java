package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
		System.out.println(date);
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		try {
			Date date1 = sd.parse(shinyaBirthday);
			Date date2 = sd.parse(minamiBirthday);
			String str1 = new SimpleDateFormat("yyyy/MM/dd").format(date1);
			String str2 = new SimpleDateFormat("yyyy/MM/dd").format(date2);

			if (date2.after(date1)) {
				System.out.println(str1);
			} else {
				System.out.println(str2);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		try {
			Date date3 = sd.parse(furuyamaBirthday);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date3);
			calendar.add(Calendar.YEAR, 5);
			calendar.add(Calendar.MONTH, 2);
			Date d3 = calendar.getTime();
			String str3 = new SimpleDateFormat("yyyy/MM/dd").format(d3);
			System.out.println(str3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

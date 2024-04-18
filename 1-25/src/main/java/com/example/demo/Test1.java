package com.example.demo;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test1 {
    public static void main(String[] args) {
        //改行
        System.out.println("問１");
        //問題1:下記条件になるようログの出力を行いなさい。
        Logger middleskilllog = Logger.getLogger(Test1.class.getName());

        String path = System.getProperty("user.dir");
        path = new File(path, "sample_log.txt").getPath();
        System.out.println(path);

        try {
            FileHandler fHandler = new FileHandler("middleskill.log", true);
            fHandler.setFormatter(new SimpleFormatter());
            middleskilllog.addHandler(fHandler);

            throw new NullPointerException();
        } catch (NullPointerException e) {
            // TODO: handle exception
            middleskilllog.log(Level.INFO, "ミドルスキルログが発生しました。");
        } catch (Exception e) {
            // TODO: handle exception
        }

        //条件１　例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
        //条件２　"middleskill log"という名前のログのインスタンスを生成する事
        //条件３　srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
        //条件４　ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
        //条件５　格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事
    }
}

package to.msn.wings.minecraft_memo2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 4163104 on 2017/09/05.
 */

public class MemoOpenHelper extends SQLiteOpenHelper {

    // データベース名
    static final private String DBName = "MEMO_DB";
    // データベースのバージョン(2,3と挙げていくとonUpgradeメソッドが実行される)
    static final private int VERSION = 1;

    // コンストラクタ　以下のように呼ぶこと
    public MemoOpenHelper(Context context){
        super(context, DBName, null, VERSION);
    }

    // データベースが作成された時に実行される処理
    // データベースはアプリを開いた時に存在しなかったら作成され、すでに存在していれば何もしない
    @Override
    public void onCreate(SQLiteDatabase db) {
        /**
         * テーブルを作成する
         * execSQLメソッドにCREATET TABLE命令を文字列として渡すことで実行される
         * 引数で指定されているものの意味は以下の通り
         * 引数1 ・・・ id：列名 , INTEGER：数値型 , PRIMATY KEY：テーブル内の行で重複無し , AUTOINCREMENT：1から順番に振っていく
         * 引数2 ・・・ uuid：列名 , TEXT：文字列型
         * 引数3 ・・・ body：列名 , INTEGER：数値型
         */
        db.execSQL("CREATE TABLE MEMO_TABLE (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "uuid TEXT, " +
                "body TEXT)");

    }

    // データベースをバージョンアップした時に実行される処理
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /**
         * テーブルを削除する
         */
        db.execSQL("DROP TABLE IF EXISTS MEMO_TABLE");

        // 新しくテーブルを作成する
        onCreate(db);
    }

}
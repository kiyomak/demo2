/*Lesson3_Chapter21_SpringBoot  認証・認可

・認証（Authentication）：通信相手が誰であるかを確認すること。
・認可（Authorization）：画面にアクセスする権限や処理を行う権限など、特定の条件に対してアクセスの権限を与えること。

[ ハッシュ化とは ]
文字列を特定のアルゴリズム（ハッシュ関数）を用いて、一見ランダムに見える別の値（ハッシュ値）にデータを変換する方法。
暗号化は元の値に戻せるが、ハッシュ化は元に戻せない。そのためハッシュ値から元のデータを割り出すことは困難。
もしデータベースの情報が外部にもれたとしても、ハッシュ値から元の値を復元するのは困難なので、パスワードをそのまま保存するより安全となる。

*/

//②ハッシュ値を求めるプログラムを作成する

package com.example.demo2;

//今回は、BCryptPasswordEncoderを使用する
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
	
	public static void main(String[] args) {
		// ハッシュ化したいパスワードを入力する
		String rawPassword="admin";
		
		//上記のパスワードをハッシュ化するメソッドにハッシュ化したいパスワードを入れる
		String password = getEncodePassword(rawPassword);
		
		//ハッシュ化された値を表示する
		System.out.println(password);
		
	}
	
	//ハッシュ化するためのメソッド(今回は)getEncodePassword()をつくる
	private static String getEncodePassword(String rawPassword) {
		//BCryptPasswordEncoderクラスをインスタンス化する
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		//戻り値を、BCryptPasswordEncoderクラスのメソッド.encode()を使ってパスワード→ハッシュ値にエンコード(変換)したものにする
		return passwordEncoder.encode(rawPassword);
		
	}
	
}

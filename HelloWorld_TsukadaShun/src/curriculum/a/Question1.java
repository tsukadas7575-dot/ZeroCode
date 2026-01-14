package curriculum.a;
/**********************************************************************************
* [概要] 変数・型変換・条件演算子の学習処理
* [詳細] 各設問(Q1〜Q13)に従い、変数宣言・演算・出力を行う
**********************************************************************************/
public class Question1 {
	/*-------------------------------------------------------------------------
	[概要] メイン処理
	-------------------------------------------------------------------------*/
    public static void main(String[] args) {
    	
      // Q1:変数宣言と初期値設定
      byte byteNum = 0;
      short shortNum = 0;
      int intNum = 0;
      long longNum = 0L;
      float floatNum = 0.0f;
      double doubleNum = 0.0;
      char letter = '\u0000';
      String letters = null;
      boolean isBoolean = false;
  	
  	  //Q2:宣言各型の変数指定値を代入
  	  //変数byteNumに10を代入
      byteNum = 10;
      //変数shortNumに100を代入
      shortNum = 100;
      //変数intNumに1000を代入
      intNum = 1000;
      //変数longNumに10000を代入
      longNum = 10000;
      //変数floatNumに9.5fを代入
      floatNum = 9.5f;
      //変数doubleNumに10.5を代入
      doubleNum = 10.5;
      //変数letterに"a"を代入
      letter = 'a';
      //変数lettersに"ハロー"を代入
      letters = "ハロー";
      //変数isBooleanにtrueを代入
      isBoolean = true;

     // Q3: 代入した変数を使って出力
     // 11110 を出力
     long sum1 = byteNum + shortNum + intNum + longNum ; 
     System.out.println(sum1);

     // 20 を出力
     int sum2 = byteNum+ byteNum;
     System.out.println(sum2);

     // a ハロー trueを出力
     System.out.println(letter + " " + letters + " " + isBoolean + " "
                       );

     // 数字を全て足して出力
     long total =   sum2 + byteNum + shortNum + intNum + longNum;
     System.out.println(total);
     
     // 小数点以外に数字を全てかけて出力
     long productIntegers = byteNum * shortNum * intNum * longNum;
     System.out.println(productIntegers);

     // 10.5 / 100 を出力
     System.out.println(doubleNum / 100);

     // 10 - 100 を出力
     System.out.println(byteNum - shortNum);
     
     
     
     // Q4: name という String型の変数を宣言し、値を代入
     String name = "山田太郎";
     System.out.println("こんにちは、" + name + "さん！"); // 出力: 山田太郎さん！

     // Q5: age という int型の変数を宣言し、値を代入
     int age = 25;
     System.out.println("年齢: " + age + "歳"); // 出力: 年齢: 25歳

     // Q6: num1 と num2 を宣言して足す
     int num1 = 10;
     int num2 = 5;
     int sum = num1 + num2;
     System.out.println("num1 + num2 = " + sum); // 出力: num1 + num2 = 15

     // Q7: score という int型の変数を宣言して更新
     int score = 80;
     score += 20; // score に 20 を加算
     System.out.println("最終スコア: " + score); // 出力: 最終スコア: 100
     
     // Q8: double型の変数priceを宣言し、99.99を代入
     double price = 99.99;
     // double型をint型に変換
     int intPrice = (int) price;
     // 整数価格を出力
     System.out.println("整数価格: " + intPrice);

     // Q9: String型の変数numStrに"123"を代入
     String numStr = "123";
     // String型をint型に変換
     int convertedNum = Integer.parseInt(numStr);
     // 変換後の値に10を足して出力
     System.out.println("変換後の値: " + (convertedNum + 10));

     // Q10: int型の変数numに50を代入
     int num = 50;
     // int型をString型に変換して表示
     System.out.println("得点: " + num + "点");
     

     // Q11: aがbより小さいかを判定して出力する
     int a = 10;
     int b = 20;

     boolean result = (a < b);
     System.out.println(result);
     
     // Q12: 条件演算子を使用してOKかNGを判定し出力する
     int x = 15;
     String judge = (x >= 10) ? "OK" : "NG";
     System.out.println(judge);
     
     // Q13: 文字列中のJavaをPythonに置換して出力する
     String text = "私はJavaが好きです。Javaは楽しい！";
     String replacedText = text.replace("Java", "Python");
     System.out.println(replacedText);

    }

}


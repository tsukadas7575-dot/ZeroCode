package curriculum.b; // curriculum.b パッケージに属するクラス

public class Question5 {

    // Q1：引数なし・戻り値なしで Hello, World! を表示するメソッド
    public static void helloWorld() {
        System.out.println("Hello, World!"); // 文字列をコンソールに表示
    }

    // Q2：整数を受け取り、その2倍を返すメソッド
    public static int doubleValue(int number) {
        return number * 2; // 引数numberを2倍して返す
    }

    // Q3：偶数かどうかを判定するメソッド
    public static boolean isEven(int number) {
        return number % 2 == 0; // 2で割り切れればtrue（偶数）
    }
    public static void main(String[] args) {

        // Q1 実行
        helloWorld();

        // Q2 実行
        int originalNumber = 10;                       // 元の数値
        int doubledNumber = doubleValue(originalNumber); // 2倍した結果
        System.out.println(originalNumber + " を 2 倍すると " + doubledNumber + " です。");

        // Q3 実行
        int num1 = 7;   // 奇数
        int num2 = 10;  // 偶数

        // 偶数判定（num2）
        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }

        // 偶数判定（num1）
        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }
    }
}


package curriculum.b;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Q1: 1〜10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Q2: 偶数 2〜20
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        // Q3: 10〜1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Q4: 1〜100 合計
        int sumFor = 0;
        for (int i = 1; i <= 100; i++) {
            sumFor += i;
        }
        System.out.println(sumFor);

        System.out.println();

        // Q5: 三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Q6: while 1〜10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        // Q7: while 偶数
        int even = 2;
        while (even <= 20) {
            System.out.println(even);
            even += 2;
        }

        System.out.println();

        // Q8: while カウントダウン
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println();

        // Q9: while 合計
        int num = 1;
        int sumWhile = 0;
        while (num <= 100) {
            sumWhile += num;
            num++;
        }
        System.out.println(sumWhile);

        System.out.println();

        // Q10: 0が入力されるまで繰り返す
        int inputNumber = -1;
        while (inputNumber != 0) {
            System.out.print("数値を入力してください（0で終了）: ");
            inputNumber = scanner.nextInt();
        }
        System.out.println("終了しました");

        System.out.println();

        // Q11: 九九（横並び）
        for (int dan = 1; dan <= 9; dan++) {
            for (int kakeru = 1; kakeru <= 9; kakeru++) {
                System.out.print(
                        String.format("%02d * %02d = %02d", dan, kakeru, dan * kakeru)
                );
                if (kakeru < 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // ===========================================================================
        // Q12: 商品在庫管理（修正）同じ商品名が複数回入力されても在庫数が変わらず反映されるように。
        // ===========================================================================

        scanner.nextLine(); // nextIntの改行対策

        System.out.print("商品名を「、」区切りで入力してください：");
        String productInput = scanner.nextLine();
        String[] products = productInput.split("、");

        // ★ 在庫は最初に1回だけ決める
        int pcStock = (int)(Math.random() * 12);
        int fridgeStock = (int)(Math.random() * 12);
        int fanStock = (int)(Math.random() * 12);
        int washerStock = (int)(Math.random() * 12);
        int humidifierStock = (int)(Math.random() * 12);

        // テレビとディスプレイは連動
        int tvStock = (int)(Math.random() * 12);
        int displayStock = 11 - tvStock;

        for (String product : products) {

            switch (product.trim()) {

                case "パソコン":
                    System.out.println("パソコンの残り台数は " + pcStock + "台です");
                    break;

                case "冷蔵庫":
                    System.out.println("冷蔵庫の残り台数は " + fridgeStock + "台です");
                    break;

                case "扇風機":
                    System.out.println("扇風機の残り台数は " + fanStock + "台です");
                    break;

                case "洗濯機":
                    System.out.println("洗濯機の残り台数は " + washerStock + "台です");
                    break;

                case "加湿器":
                    System.out.println("加湿器の残り台数は " + humidifierStock + "台です");
                    break;

                case "テレビ":
                    System.out.println("テレビの残り台数は " + tvStock + "台です");
                    break;

                case "ディスプレイ":
                    System.out.println("ディスプレイの残り台数は " + displayStock + "台です");
                    break;

                default:
                    System.out.println("『 " + product.trim() + " 』は指定の商品ではありません");
            }
        }

        scanner.close();
    }
}

package curriculum.b;
/**********************************************************************************
* [概要] 条件分岐（if / switch）とコンソール入力の学習
* [詳細] 各設問(Q1〜Q10)に従い、条件判定と出力処理を行う
**********************************************************************************/
import java.util.Scanner;

public class Question2 {
	/*-------------------------------------------------------------------------
	 [概要] メイン処理
	-------------------------------------------------------------------------*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Q1: int型の変数scoreに75を代入し、60以上なら「合格です！」と表示
        int score = 75;
        if (score >= 60) {
            System.out.println("Q1: 合格です！");
        }

        // Q2: int型の変数ageに25を代入し、20以上30以下か判定する
        int age = 25;
        if (age >= 20 && age <= 30) {
            System.out.println("Q2: 適正年齢です");
        } else {
            System.out.println("Q2: 対象外です");
        }

        // Q3: 年齢に応じて成人・ティーン・子供を判定する
        age = 18;
        if (age >= 20) {
            System.out.println("Q3: 成人です");
        } else if (age >= 13) {
            System.out.println("Q3: ティーンエイジャーです");
        } else {
            System.out.println("Q3: 子供です");
        }

        // Q4: x, y, zの中で最大値を判定して表示する
        int x = 30;
        int y = 15;
        int z = 50;

        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println("Q4: 一番大きい数値は " + max);

        // Q5: 数値を入力し、正・0・負を判定する
        System.out.print("Q5: 数値を入力してください: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Q5: 正の数です");
        } else if (num == 0) {
            System.out.println("Q5: 0です");
        } else {
            System.out.println("Q5: 負の数です");
        }

        // Q6: 入力した数値が偶数か奇数か判定する
        System.out.print("Q6: 数値を入力してください: "
        		+ " ");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("Q6: 偶数です");
        } else {
            System.out.println("Q6: 奇数です");
        }

        // Q7: 入力された点数に応じて評価を判定する
        System.out.print("Q7: 点数を入力してください: ");
        score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Q7: 優");
        } else if (score >= 70) {
            System.out.println("Q7: 良");
        } else if (score >= 50) {
            System.out.println("Q7: 可");
        } else {
            System.out.println("Q7: 不可");
        }

        // Q8: 入力が空文字の場合は無効と判定する
        sc.nextLine(); // 改行を吸収
        System.out.print("Q8: 文字を入力してください: ");
        String input = sc.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("Q8: 入力が無効です");
        } else {
            System.out.println("Q8: 入力は「" + input + "」です");
        }
        // Q9: switch文を使用して数値から曜日を判定する
        System.out.print("Q9: 1～7の数値を入力してください: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Q9: 月曜日");
                break;
            case 2:
                System.out.println("Q9: 火曜日");
                break;
            case 3:
                System.out.println("Q9: 水曜日");
                break;
            case 4:
                System.out.println("Q9: 木曜日");
                break;
            case 5:
                System.out.println("Q9: 金曜日");
                break;
            case 6:
                System.out.println("Q9: 土曜日");
                break;
            case 7:
                System.out.println("Q9: 日曜日");
                break;
            default:
                System.out.println("Q9: 無効な入力です");
        }

        // Q10: switch文を使用して月から季節を判定する
        System.out.print("Q10: 1～12の月を入力してください: ");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Q10: 冬");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Q10: 春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Q10: 夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Q10: 秋");
                break;
            default:
                System.out.println("Q10: 無効な月です");
        }

        sc.close();

    }
}

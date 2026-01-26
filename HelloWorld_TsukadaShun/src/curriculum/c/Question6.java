package curriculum.c;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resourcesで安全にクローズ
            Player player = new Player();
            CPU cpu = new CPU();

            while (true) {
                int input;
                // 入力チェック: 0〜2以外は再入力
                while (true) {
                    System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
                    input = scanner.nextInt();
                    if (input >= 0 && input <= 2) break;
                    System.out.println("0〜2の数字を入力してください！");
                }

                player.setHand(input);
                cpu.generateHand();

                System.out.println("あなたの手: " + player.handName());
                System.out.println("CPUの手: " + cpu.handName());

                if ((player.getHand() == 0 && cpu.getHand() == 1) ||
                    (player.getHand() == 1 && cpu.getHand() == 2) ||
                    (player.getHand() == 2 && cpu.getHand() == 0)) {
                    System.out.println("あなたの勝ち！");
                    break;
                } else if (player.getHand() == cpu.getHand()) {
                    System.out.println("あいこ！もう一回！");
                } else {
                    System.out.println("あなたの負け…もう一回！");
                }
            }
        } // scannerは自動で閉じられる
    }
}

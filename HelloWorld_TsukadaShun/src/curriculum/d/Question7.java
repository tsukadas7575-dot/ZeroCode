package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        // Scannerを安全にクローズ
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Playerの名前を入力: ");
            String playerName = scanner.nextLine();

            Character player = new Character(
                    playerName,
                    rand.nextInt(51) + 50, // HP 50~100
                    rand.nextInt(11) + 10, // AT 10~20
                    rand.nextInt(6) + 5    // SP 5~10
            );

            Character daemon = loadDaemon("daemon_status.txt");

            // BufferedWriterも安全にクローズ
            try (BufferedWriter log = new BufferedWriter(new FileWriter("battle_log.txt"))) {

                // 先攻決定
                Character first, second;
                if (player.sp > daemon.sp) {
                    first = player;
                    second = daemon;
                } else if (player.sp < daemon.sp) {
                    first = daemon;
                    second = player;
                } else {
                    if (rand.nextBoolean()) {
                        first = player;
                        second = daemon;
                    } else {
                        first = daemon;
                        second = player;
                    }
                }

                log.write("先攻: " + first.name + "\n");

                // ターン制バトル
                while (player.isAlive() && daemon.isAlive()) {

                    // 先攻攻撃
                    first.attack(second);
                    log.write(first.name + " の攻撃 → " + second.name + " HP: " + second.hp + "\n");
                    if (!second.isAlive()) break;

                    // 後攻攻撃
                    second.attack(first);
                    log.write(second.name + " の攻撃 → " + first.name + " HP: " + first.hp + "\n");
                }

                // 勝者判定
                if (player.isAlive()) {
                    log.write("勝者: " + player.name + "\n");
                } else {
                    log.write("勝者: " + daemon.name + "\n");
                }

                System.out.println("バトル終了！ battle_log.txt を確認してください。");
            }
        }
    }

    // Daemonをテキストファイルから読み込み
    static Character loadDaemon(String filename) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String name = br.readLine();
            int hp = Integer.parseInt(br.readLine());
            int at = Integer.parseInt(br.readLine());
            int sp = Integer.parseInt(br.readLine());
            return new Character(name, hp, at, sp);
        }
    }
}

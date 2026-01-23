package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Playerの名前を入力: ");
        String playerName = scanner.nextLine();

        Character player = new Character(
                playerName,
                rand.nextInt(51) + 50,
                rand.nextInt(11) + 10,
                rand.nextInt(6) + 5
        );

        Character daemon = loadDaemon("daemon_status.txt");

        BufferedWriter log = new BufferedWriter(new FileWriter("battle_log.txt"));

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

        while (player.isAlive() && daemon.isAlive()) {
            first.attack(second);
            log.write(first.name + " の攻撃 → " + second.name + " HP: " + second.hp + "\n");
            if (!second.isAlive()) break;

            second.attack(first);
            log.write(second.name + " の攻撃 → " + first.name + " HP: " + first.hp + "\n");
        }

        if (player.isAlive()) {
            log.write("勝者: " + player.name);
        } else {
            log.write("勝者: " + daemon.name);
        }

        log.close();
        scanner.close();
    }

    static Character loadDaemon(String filename) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String name = br.readLine();
        int hp = Integer.parseInt(br.readLine());
        int at = Integer.parseInt(br.readLine());
        int sp = Integer.parseInt(br.readLine());
        br.close();
        return new Character(name, hp, at, sp);
    }
}

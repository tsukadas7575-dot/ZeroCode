package curriculum.c;

import java.util.Random;

public class CPU {
    private int hand;
    private Random rand = new Random(); // フィールドで1回だけ生成

    public void generateHand() {
        hand = rand.nextInt(3); // 0〜2のランダム
    }

    public int getHand() {
        return hand;
    }

    public String handName() {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "不明";
        }
    }
}

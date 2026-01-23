package curriculum.c;

import java.util.Random;

public class CPU {
    private int hand;

    public void generateHand() {
        Random rand = new Random();
        hand = rand.nextInt(3);
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

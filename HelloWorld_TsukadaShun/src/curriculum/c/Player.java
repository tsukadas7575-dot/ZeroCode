package curriculum.c;

public class Player {
    private int hand;

    public void setHand(int hand) {
        this.hand = hand;
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

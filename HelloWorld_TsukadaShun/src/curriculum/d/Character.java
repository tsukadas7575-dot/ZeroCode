package curriculum.d;

public class Character {
    String name;
    int hp;
    int at;
    int sp;

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void attack(Character target) {
        target.hp = Math.max(0, target.hp - this.at); // HPマイナス防止
    }
}

package curriculum.b; // curriculum.b パッケージ

public class Animal {

    // フィールド（クラスが持つデータ）
    private String animalName;   // 動物名
    private double bodyLength;   // 体長（m）
    private int speed;           // 速度（km/h）

    // 動物名のsetter
    public void setAnimalName(String animalName) {
        this.animalName = animalName; // thisは「このオブジェクト自身」
    }

    // 動物名のgetter
    public String getAnimalName() {
        return animalName;
    }

    // 体長のsetter
    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    // 体長のgetter
    public double getBodyLength() {
        return bodyLength;
    }

    // 速度のsetter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // 速度のgetter
    public int getSpeed() {
        return speed;
    }
}

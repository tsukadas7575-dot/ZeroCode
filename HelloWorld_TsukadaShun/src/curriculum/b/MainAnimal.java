package curriculum.b; // 同じパッケージ

public class MainAnimal {
    public static void main(String[] args) {

        Animal lion = new Animal(); // Animalクラスのインスタンス生成

        // setterを使って値を設定
        lion.setAnimalName("ライオン");
        lion.setBodyLength(2.1);
        lion.setSpeed(80);

        // getterを使って値を取得し表示
        System.out.println("動物名：" + lion.getAnimalName());
        System.out.println("体長：" + lion.getBodyLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}

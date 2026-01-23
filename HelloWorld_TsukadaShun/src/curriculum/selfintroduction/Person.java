package curriculum.selfintroduction;

class Person {
    // フィールド（データ）
    String name;
    int age;
    double height;
    double weight;
    static int count = 0;  // 人数カウント用

    // コンストラクタ（初期化用）
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    // インスタンスメソッド（BMI計算）
    double bmi() {
        return weight / (height * height);
    }

    // インスタンスメソッド（自己紹介表示）
    void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
        System.out.println("合計" + Person.count + "人です");
    }
}

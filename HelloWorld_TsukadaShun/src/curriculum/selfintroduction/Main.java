package curriculum.selfintroduction;

class Main {
    public static void main(String[] args) {
        // Personオブジェクトを作成（フィールドに値をセット）
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

        // 作ったメソッドを呼んで表示
        person1.print();
    }
}

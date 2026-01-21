package curriculum.h;

public class Main {

    public static void main(String[] args) {

        Employee fullTime = new FullTimeEmployee("F001", "正社員A");
        Employee partTime = new PartTimeEmployee("P001", "パートB");

        System.out.println("正社員の給与: " + fullTime.calculateDailyWage(9) + " 円");
        System.out.println("パート社員の給与: " + partTime.calculateDailyWage(9) + " 円");
    }
}

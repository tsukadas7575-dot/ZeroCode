package curriculum.k;

public abstract class Employee implements Payable {
    protected String name;
    protected int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    // 給与計算はサブクラスに任せる
    public abstract int calculateSalary();
}

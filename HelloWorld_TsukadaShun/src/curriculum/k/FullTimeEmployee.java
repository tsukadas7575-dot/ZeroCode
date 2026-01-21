package curriculum.k;

public class FullTimeEmployee extends Employee {

    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String name, int hours) {
        super(name, hours);
    }

    @Override
    public int calculateSalary() {
        return hours * HOURLY_RATE;
    }
}

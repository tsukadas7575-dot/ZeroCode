package curriculum.k;

import java.util.List;

public class SalaryReporter {

    public void report(List<Payable> payables) {
        for (Payable p : payables) {
            if (p instanceof Employee e) { // Java 16+ パターンマッチ
                System.out.println(e.getName() + " の給料は " + e.calculateSalary() + " 円");
            }
        }
    }
}

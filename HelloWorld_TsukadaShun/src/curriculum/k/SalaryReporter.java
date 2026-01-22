package curriculum.k;

import java.util.List;

public class SalaryReporter {
    public void report(List<Payable> payables) {
        for (Payable p : payables) {
            System.out.println(p.getName() + " の給料は " + p.calculateSalary() + " 円");
        }
    }
}


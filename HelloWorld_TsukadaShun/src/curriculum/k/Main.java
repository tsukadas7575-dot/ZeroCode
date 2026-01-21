package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Payable> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("山田太郎", 8));
        employees.add(new ContractEmployee("佐藤花子", 6));
        employees.add(new FullTimeEmployee("田中次郎", 10));

        SalaryReporter reporter = new SalaryReporter();
        reporter.report(employees);
    }
}

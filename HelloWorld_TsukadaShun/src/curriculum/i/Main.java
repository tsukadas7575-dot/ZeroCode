package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("F001", "正社員A"));
        employees.add(new ContractEmployee("C001", "契約社員B"));
        employees.add(new FullTimeEmployee("F002", "正社員C"));

        for (Employee e : employees) {
            int wage = e.calculateDailyWage(9);
            System.out.println(e.name + " の日給: " + wage + " 円");
        }
    }
}


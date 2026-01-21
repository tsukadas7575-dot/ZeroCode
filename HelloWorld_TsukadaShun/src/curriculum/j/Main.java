package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Billable> billables = new ArrayList<>();

        billables.add(new FullTimeEmployee("F001", "正社員A"));
        billables.add(new ContractEmployee("C001", "契約社員B"));
        billables.add(new FullTimeEmployee("F002", "正社員C"));

        for (Billable b : billables) {
            System.out.println("日給: " + b.costForDay(9) + " 円");
        }
    }
}

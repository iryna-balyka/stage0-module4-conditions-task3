package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float salaryNetto;
        if (salary <= 10000 & salary > 0) {
            salaryNetto = salary * (100 - 15) / 100;
            System.out.println(salaryNetto);
        }
        if (salary > 10000 & salary <= 20000) {
            salaryNetto = salary * (100 - 18) / 100;
            System.out.println(salaryNetto);
        }
        if (salary > 20000) {
            salaryNetto = salary * (100 - 20) / 100;
            System.out.println(salaryNetto);
        }
        if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}

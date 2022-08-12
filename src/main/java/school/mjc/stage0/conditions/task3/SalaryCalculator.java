package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        //Basic Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"
        if(salary>0 &&salary<= 10000)
        {
            System.out.println(salary-salary*0.15);
        }
        if(salary> 10000 && salary<=20000)
        {
            System.out.println(salary-salary*0.18);
        }
        if(salary> 20000)
        {
            System.out.println(salary-salary*0.20);
        }
        if(salary<0)
        {
            System.out.println("wrong input!");
        }
    }
}

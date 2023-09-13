package task1;

import java.util.Date;

public class Main {
    /**
     * Базовое задние:
     * 1) Переписать код в соответствии с Single
     * Responsibility Principle:
     * public class Employee {
     * private String name;
     * private Date dob;
     * private int baseSalary;
     * public Employee(String name, Date dob, int baseSalary) {
     * this.name = name;
     * this.dob = dob;
     * this.baseSalary = baseSalary;
     * }
     * public String getEmplnfo() {
     * return "name -" + name + ", dob -" + dob.toString();
     * }
     * public int calculateNetSalary() {
     * int tax = (int) (baseSalary * 0.25);//calculate in otherway
     * return baseSalary - tax;
     * }
     * }
     * Подсказка: вынесите метод calculateNetSalary() в отдельный класс
     */
    public static void main(String[] args) {
        Date date = new Date();
        Employee employee = new Employee("Tom",date, 80000);
        CalculateNetSalary calculateNetSalary = new CalculateNetSalary();
        System.out.println(calculateNetSalary.calculateNetSalary(employee));
    }
}


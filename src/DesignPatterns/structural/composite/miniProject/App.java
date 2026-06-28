package DesignPatterns.structural.composite.miniProject;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Department engineering = new Department("Engineering");
        engineering.add(new Employee("Amit", 60000));
        engineering.add(new Employee("Neha", 70000));

        Department qa = new Department("QA");
        qa.add(new Employee("Ravi", 45000));

        Department company = new Department("CodeN");
        company.add(engineering);
        company.add(qa);

        company.print("");
        System.out.println("Total salary cost: " + company.getCost());
    }
}

interface OrganizationUnit {
    double getCost();

    void print(String space);
}

class Employee implements OrganizationUnit {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getCost() {
        return salary;
    }

    @Override
    public void print(String space) {
        System.out.println(space + "Employee: " + name + ", salary=" + salary);
    }
}

class Department implements OrganizationUnit {
    private final String name;
    private final List<OrganizationUnit> units = new ArrayList<OrganizationUnit>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrganizationUnit unit) {
        units.add(unit);
    }

    @Override
    public double getCost() {
        double total = 0;
        for (OrganizationUnit unit : units) {
            total = total + unit.getCost();
        }
        return total;
    }

    @Override
    public void print(String space) {
        System.out.println(space + "Department: " + name);
        for (OrganizationUnit unit : units) {
            unit.print(space + "  ");
        }
    }
}

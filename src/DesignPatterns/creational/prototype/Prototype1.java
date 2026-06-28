package DesignPatterns.creational.prototype;

/*
Prototype1.java

First we will see the problem.

We are creating similar report objects again and again manually.
*/
public class Prototype1 {
    public static void main(String[] args) {

        Report1 januaryReport = new Report1("Sales Report", "Company Logo", "Standard Footer");
        januaryReport.setMonth("January");

        Report1 februaryReport = new Report1("Sales Report", "Company Logo", "Standard Footer");
        februaryReport.setMonth("February");

        januaryReport.print();
        februaryReport.print();

        /*
        Problem:

        Title, logo, and footer are same.
        Only month changes.

        Still we are repeating full object creation.

        In real applications, setup can be much bigger.

        Let's improve this in Prototype2.java.
        */
    }
}

class Report1 {
    private final String title;
    private final String logo;
    private final String footer;
    private String month;

    public Report1(String title, String logo, String footer) {
        this.title = title;
        this.logo = logo;
        this.footer = footer;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void print() {
        System.out.println(title + " | " + logo + " | " + footer + " | month=" + month);
    }
}

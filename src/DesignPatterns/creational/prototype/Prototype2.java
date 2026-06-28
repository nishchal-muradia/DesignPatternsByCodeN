package DesignPatterns.creational.prototype;

/*
Prototype2.java

Now we add a copy method.

The object itself knows how to create a copy of itself.
*/
public class Prototype2 {
    public static void main(String[] args) {

        Report2 baseReport = new Report2("Sales Report", "Company Logo", "Standard Footer");

        /*
        Instead of creating full report from scratch,
        we copy the base report and change only the month.
        */
        Report2 januaryReport = baseReport.copy();
        januaryReport.setMonth("January");

        Report2 februaryReport = baseReport.copy();
        februaryReport.setMonth("February");

        januaryReport.print();
        februaryReport.print();
    }
}

class Report2 {
    private final String title;
    private final String logo;
    private final String footer;
    private String month;

    public Report2(String title, String logo, String footer) {
        this.title = title;
        this.logo = logo;
        this.footer = footer;
    }

    /*
    This is the prototype copy method.

    It creates a new object using data from the current object.
    */
    public Report2 copy() {
        Report2 copiedReport = new Report2(title, logo, footer);
        copiedReport.month = this.month;
        return copiedReport;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void print() {
        System.out.println(title + " | " + logo + " | " + footer + " | month=" + month);
    }
}

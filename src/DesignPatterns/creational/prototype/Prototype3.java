package DesignPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/*
Prototype3.java

Now we store ready prototypes in a registry.

Client asks registry for a copy.
Client does not recreate the full object manually.
*/
public class Prototype3 {
    public static void main(String[] args) {

        ReportRegistry3 registry = new ReportRegistry3();

        Report3 salesReport = registry.getReport("SALES");
        salesReport.setMonth("March");
        salesReport.print();

        Report3 financeReport = registry.getReport("FINANCE");
        financeReport.setMonth("March");
        financeReport.print();
    }
}

interface PrototypeReport3 {
    Report3 copy();
}

class Report3 implements PrototypeReport3 {
    private final String title;
    private final String logo;
    private final String footer;
    private String month;

    public Report3(String title, String logo, String footer) {
        this.title = title;
        this.logo = logo;
        this.footer = footer;
    }

    @Override
    public Report3 copy() {
        Report3 copiedReport = new Report3(title, logo, footer);
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

class ReportRegistry3 {
    private final Map<String, Report3> reports = new HashMap<String, Report3>();

    public ReportRegistry3() {
        reports.put("SALES", new Report3("Sales Report", "Sales Logo", "Sales Footer"));
        reports.put("FINANCE", new Report3("Finance Report", "Finance Logo", "Finance Footer"));
    }

    public Report3 getReport(String type) {
        Report3 report = reports.get(type);
        if (report == null) {
            throw new IllegalArgumentException("Unknown report type: " + type);
        }
        return report.copy();
    }
}

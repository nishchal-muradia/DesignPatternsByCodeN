package DesignPatterns.structural.bridge.miniProject;

public class App {
    public static void main(String[] args) {
        Report salesPdf = new SalesReport(new PDFExporter());
        salesPdf.export();

        Report inventoryCsv = new InventoryReport(new CSVExporter());
        inventoryCsv.export();
    }
}

interface Exporter {
    void export(String reportName, String content);
}

class PDFExporter implements Exporter {
    @Override
    public void export(String reportName, String content) {
        System.out.println("Exporting PDF: " + reportName);
        System.out.println(content);
    }
}

class CSVExporter implements Exporter {
    @Override
    public void export(String reportName, String content) {
        System.out.println("Exporting CSV: " + reportName);
        System.out.println(content.replace(" ", ","));
    }
}

abstract class Report {
    protected final Exporter exporter;

    public Report(Exporter exporter) {
        this.exporter = exporter;
    }

    public abstract void export();
}

class SalesReport extends Report {
    public SalesReport(Exporter exporter) {
        super(exporter);
    }

    @Override
    public void export() {
        exporter.export("Sales Report", "Total sales are 120000");
    }
}

class InventoryReport extends Report {
    public InventoryReport(Exporter exporter) {
        super(exporter);
    }

    @Override
    public void export() {
        exporter.export("Inventory Report", "Available items are 450");
    }
}

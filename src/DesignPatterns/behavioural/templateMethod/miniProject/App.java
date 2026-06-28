package DesignPatterns.behavioural.templateMethod.miniProject;

public class App {
    public static void main(String[] args) {
        ReportGenerator sales = new SalesReportGenerator();
        sales.generate();

        ReportGenerator users = new UserReportGenerator();
        users.generate();
    }
}

abstract class ReportGenerator {
    public final void generate() {
        fetchData();
        formatData();
        export();
        System.out.println();
    }

    protected abstract void fetchData();

    protected void formatData() {
        System.out.println("Formatting data as table");
    }

    protected abstract void export();
}

class SalesReportGenerator extends ReportGenerator {
    @Override
    protected void fetchData() {
        System.out.println("Fetching sales data");
    }

    @Override
    protected void export() {
        System.out.println("Exporting sales report as PDF");
    }
}

class UserReportGenerator extends ReportGenerator {
    @Override
    protected void fetchData() {
        System.out.println("Fetching user data");
    }

    @Override
    protected void export() {
        System.out.println("Exporting user report as CSV");
    }
}

package DesignPatterns.behavioural.command.miniProject;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        JobQueue queue = new JobQueue();

        queue.add(new EmailJob("customer@example.com"));
        queue.add(new ReportJob("sales-report"));
        queue.add(new BackupJob("orders-db"));

        queue.runAll();
    }
}

interface JobCommand {
    void execute();
}

class EmailJob implements JobCommand {
    private final String email;

    public EmailJob(String email) {
        this.email = email;
    }

    @Override
    public void execute() {
        System.out.println("Sending email to " + email);
    }
}

class ReportJob implements JobCommand {
    private final String reportName;

    public ReportJob(String reportName) {
        this.reportName = reportName;
    }

    @Override
    public void execute() {
        System.out.println("Generating report: " + reportName);
    }
}

class BackupJob implements JobCommand {
    private final String databaseName;

    public BackupJob(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void execute() {
        System.out.println("Backing up database: " + databaseName);
    }
}

class JobQueue {
    private final List<JobCommand> jobs = new ArrayList<JobCommand>();

    public void add(JobCommand command) {
        jobs.add(command);
    }

    public void runAll() {
        for (JobCommand job : jobs) {
            job.execute();
        }
    }
}

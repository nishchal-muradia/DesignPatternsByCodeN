package DesignPatterns.behavioural.chainOfResponsibility.miniProject;

public class App {
    public static void main(String[] args) {
        ExpenseApprover teamLead = new TeamLead();
        ExpenseApprover manager = new Manager();
        ExpenseApprover director = new Director();

        teamLead.setNext(manager);
        manager.setNext(director);

        teamLead.approve(3000);
        teamLead.approve(18000);
        teamLead.approve(80000);
        teamLead.approve(150000);
    }
}

abstract class ExpenseApprover {
    private ExpenseApprover next;

    public void setNext(ExpenseApprover next) {
        this.next = next;
    }

    protected void sendToNext(double amount) {
        if (next != null) {
            next.approve(amount);
        } else {
            System.out.println("Expense rejected. Amount too high: " + amount);
        }
    }

    public abstract void approve(double amount);
}

class TeamLead extends ExpenseApprover {
    @Override
    public void approve(double amount) {
        if (amount <= 5000) {
            System.out.println("Team Lead approved: " + amount);
        } else {
            sendToNext(amount);
        }
    }
}

class Manager extends ExpenseApprover {
    @Override
    public void approve(double amount) {
        if (amount <= 25000) {
            System.out.println("Manager approved: " + amount);
        } else {
            sendToNext(amount);
        }
    }
}

class Director extends ExpenseApprover {
    @Override
    public void approve(double amount) {
        if (amount <= 100000) {
            System.out.println("Director approved: " + amount);
        } else {
            sendToNext(amount);
        }
    }
}

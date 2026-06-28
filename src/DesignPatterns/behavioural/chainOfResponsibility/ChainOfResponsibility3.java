package DesignPatterns.behavioural.chainOfResponsibility;

/*
ChainOfResponsibility3.java

Now we add manager handler.

Sender still sends request to first handler only.
It does not know who will finally handle the request.
*/
public class ChainOfResponsibility3 {
    public static void main(String[] args) {
        SupportHandler3 level1 = new LevelOneSupport3();
        SupportHandler3 level2 = new LevelTwoSupport3();
        SupportHandler3 manager = new ManagerSupport3();

        level1.setNext(level2);
        level2.setNext(manager);

        level1.handle("password");
        level1.handle("network");
        level1.handle("server");
    }
}

abstract class SupportHandler3 {
    private SupportHandler3 next;

    public void setNext(SupportHandler3 next) {
        this.next = next;
    }

    protected void passToNext(String issueType) {
        if (next != null) {
            next.handle(issueType);
        } else {
            System.out.println("No handler found for: " + issueType);
        }
    }

    public abstract void handle(String issueType);
}

class LevelOneSupport3 extends SupportHandler3 {
    @Override
    public void handle(String issueType) {
        if (issueType.equalsIgnoreCase("password")) {
            System.out.println("Level 1 support fixed password issue");
        } else {
            passToNext(issueType);
        }
    }
}

class LevelTwoSupport3 extends SupportHandler3 {
    @Override
    public void handle(String issueType) {
        if (issueType.equalsIgnoreCase("network")) {
            System.out.println("Level 2 support fixed network issue");
        } else {
            passToNext(issueType);
        }
    }
}

class ManagerSupport3 extends SupportHandler3 {
    @Override
    public void handle(String issueType) {
        if (issueType.equalsIgnoreCase("server")) {
            System.out.println("Manager fixed server issue");
        } else {
            passToNext(issueType);
        }
    }
}

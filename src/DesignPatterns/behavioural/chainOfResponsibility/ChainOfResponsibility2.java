package DesignPatterns.behavioural.chainOfResponsibility;

/*
ChainOfResponsibility2.java

Now each support level is a separate handler.

If one handler cannot solve the issue, it passes request to next handler.
*/
public class ChainOfResponsibility2 {
    public static void main(String[] args) {
        SupportHandler2 level1 = new LevelOneSupport2();
        SupportHandler2 level2 = new LevelTwoSupport2();

        level1.setNext(level2);

        level1.handle("password");
        level1.handle("network");
        level1.handle("server");
    }
}

abstract class SupportHandler2 {
    private SupportHandler2 next;

    public void setNext(SupportHandler2 next) {
        this.next = next;
    }

    public void passToNext(String issueType) {
        if (next != null) {
            next.handle(issueType);
        } else {
            System.out.println("No handler found for: " + issueType);
        }
    }

    public abstract void handle(String issueType);
}

class LevelOneSupport2 extends SupportHandler2 {
    @Override
    public void handle(String issueType) {
        if (issueType.equalsIgnoreCase("password")) {
            System.out.println("Level 1 support fixed password issue");
        } else {
            passToNext(issueType);
        }
    }
}

class LevelTwoSupport2 extends SupportHandler2 {
    @Override
    public void handle(String issueType) {
        if (issueType.equalsIgnoreCase("network")) {
            System.out.println("Level 2 support fixed network issue");
        } else {
            passToNext(issueType);
        }
    }
}

package DesignPatterns.behavioural.chainOfResponsibility;

/*
ChainOfResponsibility1.java

Problem:

All request handling is inside one big if-else block.
*/
public class ChainOfResponsibility1 {
    public static void main(String[] args) {
        SupportService1 service = new SupportService1();
        service.handle("password");
        service.handle("server");
    }
}

class SupportService1 {
    public void handle(String issueType) {
        if (issueType.equalsIgnoreCase("password")) {
            System.out.println("Level 1 support fixed password issue");
        } else if (issueType.equalsIgnoreCase("network")) {
            System.out.println("Level 2 support fixed network issue");
        } else if (issueType.equalsIgnoreCase("server")) {
            System.out.println("Manager fixed server issue");
        } else {
            System.out.println("No handler found");
        }
    }
}

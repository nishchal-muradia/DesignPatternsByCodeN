package DesignPatterns.structural.proxy;

/*
Proxy3.java

Protection proxy.

Proxy checks access before calling real object.
*/
public class Proxy3 {
    public static void main(String[] args) {
        Document3 adminDocument = new DocumentProxy3("admin");
        adminDocument.open();

        Document3 guestDocument = new DocumentProxy3("guest");
        guestDocument.open();
    }
}

interface Document3 {
    void open();
}

class RealDocument3 implements Document3 {
    @Override
    public void open() {
        System.out.println("Opening confidential document");
    }
}

class DocumentProxy3 implements Document3 {
    private final String role;
    private final RealDocument3 document = new RealDocument3();

    public DocumentProxy3(String role) {
        this.role = role;
    }

    @Override
    public void open() {
        if (role.equalsIgnoreCase("admin")) {
            document.open();
        } else {
            System.out.println("Access denied for role: " + role);
        }
    }
}

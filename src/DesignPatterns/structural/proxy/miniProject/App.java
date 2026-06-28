package DesignPatterns.structural.proxy.miniProject;

public class App {
    public static void main(String[] args) {
        Document adminDocument = new SecureDocumentProxy("admin");
        adminDocument.read();

        Document internDocument = new SecureDocumentProxy("intern");
        internDocument.read();
    }
}

interface Document {
    void read();
}

class ConfidentialDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading confidential salary document");
    }
}

class SecureDocumentProxy implements Document {
    private final String role;
    private ConfidentialDocument document;

    public SecureDocumentProxy(String role) {
        this.role = role;
    }

    @Override
    public void read() {
        if (!role.equalsIgnoreCase("admin")) {
            System.out.println("Access denied for role: " + role);
            return;
        }

        if (document == null) {
            document = new ConfidentialDocument();
        }

        document.read();
    }
}

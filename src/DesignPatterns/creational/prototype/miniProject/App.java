package DesignPatterns.creational.prototype.miniProject;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        DocumentTemplateRegistry registry = new DocumentTemplateRegistry();

        Document offerLetter = registry.createDocument("OFFER_LETTER");
        offerLetter.setRecipientName("Nishchal");
        offerLetter.setCustomLine("We are happy to offer you the Java Developer role.");
        offerLetter.print();

        Document invoice = registry.createDocument("INVOICE");
        invoice.setRecipientName("ABC Pvt Ltd");
        invoice.setCustomLine("Invoice amount: Rs. 50000");
        invoice.print();
    }
}

class Document {
    private final String title;
    private final String header;
    private final String footer;
    private String recipientName;
    private String customLine;

    public Document(String title, String header, String footer) {
        this.title = title;
        this.header = header;
        this.footer = footer;
    }

    public Document copy() {
        Document document = new Document(title, header, footer);
        document.recipientName = recipientName;
        document.customLine = customLine;
        return document;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setCustomLine(String customLine) {
        this.customLine = customLine;
    }

    public void print() {
        System.out.println(title);
        System.out.println(header);
        System.out.println("To: " + recipientName);
        System.out.println(customLine);
        System.out.println(footer);
        System.out.println();
    }
}

class DocumentTemplateRegistry {
    private final Map<String, Document> templates = new HashMap<String, Document>();

    public DocumentTemplateRegistry() {
        templates.put("OFFER_LETTER", new Document(
                "Offer Letter",
                "CodeN Technologies",
                "Regards, HR Team"
        ));
        templates.put("INVOICE", new Document(
                "Invoice",
                "CodeN Billing Department",
                "Payment due within 15 days"
        ));
    }

    public Document createDocument(String type) {
        Document template = templates.get(type);
        if (template == null) {
            throw new IllegalArgumentException("Unknown template type: " + type);
        }
        return template.copy();
    }
}

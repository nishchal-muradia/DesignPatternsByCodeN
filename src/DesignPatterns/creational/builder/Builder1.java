package DesignPatterns.creational.builder;

/*
Builder1.java

First we will see the problem.

This file does not use Builder yet.
*/
public class Builder1 {
    public static void main(String[] args) {

        /*
        This constructor has many parameters.

        Beginner problem:
        It is not clear what each value means by just reading this line.

        What is true?
        What is false?
        Is "PREMIUM" role or plan?
        */
        UserAccount1 account = new UserAccount1(
                "Nishchal",
                "nishchal@example.com",
                "Delhi",
                "9999999999",
                true,
                false,
                "PREMIUM"
        );

        account.print();

        /*
        This is called telescoping constructor problem.

        As fields increase, constructor becomes harder to read and maintain.

        Let's improve this using Builder in Builder2.java.
        */
    }
}

class UserAccount1 {
    private final String name;
    private final String email;
    private final String city;
    private final String phone;
    private final boolean emailVerified;
    private final boolean admin;
    private final String plan;

    public UserAccount1(String name, String email, String city, String phone,
                        boolean emailVerified, boolean admin, String plan) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.phone = phone;
        this.emailVerified = emailVerified;
        this.admin = admin;
        this.plan = plan;
    }

    public void print() {
        System.out.println(name + " | " + email + " | " + city + " | " + phone
                + " | verified=" + emailVerified + " | admin=" + admin + " | plan=" + plan);
    }
}

package DesignPatterns.creational.builder;

/*
Builder2.java

Now we create the same type of object using Builder.

The code becomes readable because every optional value has a method name.
*/
public class Builder2 {
    public static void main(String[] args) {

        UserAccount2 account = new UserAccount2.Builder("Nishchal", "nishchal@example.com")
                .city("Delhi")
                .phone("9999999999")
                .emailVerified(true)
                .admin(false)
                .plan("PREMIUM")
                .build();

        account.print();

        /*
        Now anyone can read this object creation line by line.

        Required values are passed in Builder constructor.
        Optional values are added step by step.
        */
    }
}

class UserAccount2 {
    private final String name;
    private final String email;
    private final String city;
    private final String phone;
    private final boolean emailVerified;
    private final boolean admin;
    private final String plan;

    private UserAccount2(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.city = builder.city;
        this.phone = builder.phone;
        this.emailVerified = builder.emailVerified;
        this.admin = builder.admin;
        this.plan = builder.plan;
    }

    public void print() {
        System.out.println(name + " | " + email + " | " + city + " | " + phone
                + " | verified=" + emailVerified + " | admin=" + admin + " | plan=" + plan);
    }

    /*
    Static nested Builder class.

    It stores values temporarily.
    At the end, build() creates the final UserAccount2 object.
    */
    static class Builder {
        private final String name;
        private final String email;
        private String city = "Not provided";
        private String phone = "Not provided";
        private boolean emailVerified;
        private boolean admin;
        private String plan = "FREE";

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder emailVerified(boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        public Builder admin(boolean admin) {
            this.admin = admin;
            return this;
        }

        public Builder plan(String plan) {
            this.plan = plan;
            return this;
        }

        public UserAccount2 build() {
            return new UserAccount2(this);
        }
    }
}

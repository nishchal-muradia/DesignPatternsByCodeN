package DesignPatterns.creational.builder;

/*
Builder3.java

Builder can also keep validation in one place.

Before creating the final object, build() can check whether data is valid or not.
*/
public class Builder3 {
    public static void main(String[] args) {

        BankAccount3 account = new BankAccount3.Builder("ACC-1001")
                .ownerName("Nishchal")
                .balance(5000)
                .branch("Delhi")
                .build();

        account.print();

        /*
        Try setting balance(-10).

        The build method will stop object creation with a clear error.
        */
    }
}

class BankAccount3 {
    private final String accountNumber;
    private final String ownerName;
    private final double balance;
    private final String branch;

    private BankAccount3(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.ownerName = builder.ownerName;
        this.balance = builder.balance;
        this.branch = builder.branch;
    }

    public void print() {
        System.out.println(accountNumber + " | " + ownerName + " | balance=" + balance + " | branch=" + branch);
    }

    static class Builder {
        private final String accountNumber;
        private String ownerName = "Unknown";
        private double balance;
        private String branch = "Main";

        public Builder(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        public BankAccount3 build() {
            if (accountNumber == null || accountNumber.isEmpty()) {
                throw new IllegalArgumentException("Account number is required");
            }
            if (balance < 0) {
                throw new IllegalArgumentException("Balance cannot be negative");
            }
            return new BankAccount3(this);
        }
    }
}

package DesignPatterns.creational.builder.miniProject;

public class App {
    public static void main(String[] args) {

        FoodOrder lunch = new FoodOrder.Builder("Paneer Burger")
                .drink("Cold Coffee")
                .fries(true)
                .deliveryAddress("Sector 62, Noida")
                .build();

        FoodOrder giftOrder = new FoodOrder.Builder("Chocolate Cake")
                .dessert("Brownie")
                .giftMessage("Happy birthday")
                .deliveryAddress("Delhi")
                .build();

        lunch.print();
        giftOrder.print();
    }
}

class FoodOrder {
    private final String mainItem;
    private final String drink;
    private final boolean fries;
    private final String dessert;
    private final String deliveryAddress;
    private final String giftMessage;

    private FoodOrder(Builder builder) {
        this.mainItem = builder.mainItem;
        this.drink = builder.drink;
        this.fries = builder.fries;
        this.dessert = builder.dessert;
        this.deliveryAddress = builder.deliveryAddress;
        this.giftMessage = builder.giftMessage;
    }

    public void print() {
        System.out.println("Food Order");
        System.out.println("Main item       : " + mainItem);
        System.out.println("Drink           : " + drink);
        System.out.println("Fries included  : " + fries);
        System.out.println("Dessert         : " + dessert);
        System.out.println("Delivery address: " + deliveryAddress);
        System.out.println("Gift message    : " + giftMessage);
        System.out.println();
    }

    static class Builder {
        private final String mainItem;
        private String drink = "No drink";
        private boolean fries;
        private String dessert = "No dessert";
        private String deliveryAddress = "Pickup";
        private String giftMessage = "No gift message";

        public Builder(String mainItem) {
            this.mainItem = mainItem;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder fries(boolean fries) {
            this.fries = fries;
            return this;
        }

        public Builder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder deliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder giftMessage(String giftMessage) {
            this.giftMessage = giftMessage;
            return this;
        }

        public FoodOrder build() {
            if (mainItem == null || mainItem.isEmpty()) {
                throw new IllegalArgumentException("Main item is required");
            }
            return new FoodOrder(this);
        }
    }
}

package DesignPatterns.structural.adapter;

/*
Adapter1.java

First understand the problem.

Phone expects a USB charger.
Old charger has a different method.
*/
public class Adapter1 {
    public static void main(String[] args) {
        OldCharger1 oldCharger = new OldCharger1();

        /*
        Phone1 cannot directly use OldCharger1 cleanly because Phone1 expects USB style charging.

        Here we are calling old charger directly just to show that its interface is different.
        */
        oldCharger.chargeWithRoundPin();
    }
}

class OldCharger1 {
    public void chargeWithRoundPin() {
        System.out.println("Charging with old round pin charger");
    }
}

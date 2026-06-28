package DesignPatterns.structural.adapter;

/*
Adapter2.java

Now we add an adapter.

Phone expects USBCharger2.
OldCharger2 provides chargeWithRoundPin().

ChargerAdapter2 connects both.
*/
public class Adapter2 {
    public static void main(String[] args) {
        OldCharger2 oldCharger = new OldCharger2();
        USBCharger2 adapter = new ChargerAdapter2(oldCharger);

        Phone2 phone = new Phone2(adapter);
        phone.chargePhone();
    }
}

interface USBCharger2 {
    void chargeWithUSB();
}

class Phone2 {
    private final USBCharger2 charger;

    public Phone2(USBCharger2 charger) {
        this.charger = charger;
    }

    public void chargePhone() {
        charger.chargeWithUSB();
    }
}

class OldCharger2 {
    public void chargeWithRoundPin() {
        System.out.println("Charging with old round pin charger");
    }
}

class ChargerAdapter2 implements USBCharger2 {
    private final OldCharger2 oldCharger;

    public ChargerAdapter2(OldCharger2 oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithUSB() {
        System.out.println("Adapter converts USB request to old round pin request");
        oldCharger.chargeWithRoundPin();
    }
}

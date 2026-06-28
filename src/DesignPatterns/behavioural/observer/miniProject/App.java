package DesignPatterns.behavioural.observer.miniProject;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Stock stock = new Stock("TCS");

        Investor amit = new MobileInvestor("Amit");
        Investor neha = new MobileInvestor("Neha");

        stock.subscribe(amit);
        stock.subscribe(neha);

        stock.setPrice(3850);
        stock.setPrice(3920);
    }
}

interface Investor {
    void update(String stockName, double price);
}

class MobileInvestor implements Investor {
    private final String name;

    public MobileInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " got alert: " + stockName + " price is " + price);
    }
}

class Stock {
    private final String name;
    private final List<Investor> investors = new ArrayList<Investor>();
    private double price;

    public Stock(String name) {
        this.name = name;
    }

    public void subscribe(Investor investor) {
        investors.add(investor);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    private void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(name, price);
        }
    }
}

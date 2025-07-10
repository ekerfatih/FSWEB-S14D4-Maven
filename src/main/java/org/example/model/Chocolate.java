package org.example.model;

public class Chocolate extends ProductForSale {

    private double cocoaAmount;

    public Chocolate(String type, double price, String description, double cocoaAmount) {
        super(type, price, description);
        this.cocoaAmount = cocoaAmount;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate{" +
                "cocoaAmount=" + cocoaAmount +
                '}');
    }
}

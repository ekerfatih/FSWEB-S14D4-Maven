package org.example.model;

public class Coke extends ProductForSale {
    private int sugarAmount;

    public Coke(String type, double price, String description, int sugarAmount) {
        super(type, price, description);
        this.sugarAmount = sugarAmount;
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Coke{" +
                "sugarAmount=" + sugarAmount +
                '}');
    }
}

package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] productList = {
                new Chocolate("white", 50, "Milika sütlü", 10),
                new Bread("Kepekli", 45, "Tahıllı", "İnce Kepek"),
                new Coke("Light", 55, "330 ml", 45)
        };
        listProducts(productList);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}
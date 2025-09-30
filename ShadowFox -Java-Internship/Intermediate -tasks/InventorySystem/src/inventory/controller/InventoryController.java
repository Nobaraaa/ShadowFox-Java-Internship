package inventory.controller;

import inventory.model.Product;
import java.util.ArrayList;
import java.util.List;

public class InventoryController {
    private List<Product> products;

    public InventoryController() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalStockValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }
}
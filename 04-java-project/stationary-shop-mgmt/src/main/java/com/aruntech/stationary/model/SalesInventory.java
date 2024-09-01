package com.aruntech.stationary.model;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;

public class SalesInventory {
    private Map<String, List<SaleItem>> sales = new HashMap<>();

    public Map<String, List<SaleItem>> getSales() {
        return sales;
    }

    public void addSalesDetails(CartItem cartItem) {
        sales.put(cartItem.getId(), cartItem.getSaleItems());
    }

    public double getTotalSalesAmount() {
        Set<String> keys = sales.keySet();
        double total = 0.0;
        for(String key: keys) {
            List<SaleItem> saleItems = sales.get(key);
            for(SaleItem saleItem: saleItems) {
                total += saleItem.getPrice() * saleItem.getQty();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "SalesInventory{" +
                ", sales=" + sales +
                '}';
    }
}

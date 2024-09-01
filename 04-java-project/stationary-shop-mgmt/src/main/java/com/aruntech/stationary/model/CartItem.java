package com.aruntech.stationary.model;

import java.util.List;
import java.util.ArrayList;

public class CartItem {
    private String id;
    private int userId;
    private String userName;
    private List<SaleItem> saleItems;

    public CartItem(String id, int userId, String userName) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        saleItems = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void addItemToCart(SaleItem saleItem) {
        saleItems.add(saleItem);
    }

    public double getPrice() {
        double total = 0.0;
        for(SaleItem saleItem : saleItems) {
            total += saleItem.getQty() * saleItem.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", saleItems =" + saleItems +
                '}';
    }
}

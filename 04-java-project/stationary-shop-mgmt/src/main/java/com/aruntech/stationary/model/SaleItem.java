package com.aruntech.stationary.model;

public class SaleItem {
    private int productId;
    private String productName;
    private double price;
    private int qty;

    public SaleItem() {
    }

    public SaleItem(int productId, String productName, double price, int qty) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "SalesItem{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

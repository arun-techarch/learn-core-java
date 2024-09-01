package com.aruntech.stationary.service;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Scanner;
import com.aruntech.stationary.model.User;
import com.aruntech.stationary.model.Product;
import com.aruntech.stationary.model.SaleItem;
import com.aruntech.stationary.model.SalesInventory;

public class AdminUserManagement extends AbstractUserManagement {

    public AdminUserManagement(Scanner scanner, User user, SalesInventory inventory, Map<Integer, Product> stockInventory) {
        super(scanner, user, inventory, stockInventory);
    }

    @Override
    public void showListOptions() {
        System.out.println("1.Inventory Management");
        System.out.println("2.Reports");
        System.out.println("3.Logout");
        System.out.println("Please select the option:");
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                showInventoryManagement();
                break;
            case 2:
                showReports();
                break;
            case 3:
                logout();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    private void showInventoryManagement() {
        System.out.println("1.Add Product");
        System.out.println("2.Update Stock");
        System.out.println("3.Remove Product");
        System.out.println("4.Back");
        System.out.println("5.Logout");
        System.out.println("Please select the option:");
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                addProduct();
                break;
            case 2:
                updateStock();
                break;
            case 3:
                removeProduct();
                break;
            case 4:
                showBackOption();
                break;
            case 5:
                logout();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public void addProduct() {
        System.out.print("Enter product id:");
        int id = scanner.nextInt();
        System.out.print("Enter product name:");
        String name = scanner.next();
        System.out.print("Enter product brand:");
        String brand = scanner.next();
        System.out.print("Enter product qty:");
        int qty = scanner.nextInt();
        System.out.print("Enter product price:");
        double price = scanner.nextDouble();

        if(stockInventory.get(id) != null) {
            System.out.printf("%d product was already exists %n", id);
        } else {
            Product product = new Product(id, name, brand, qty, price);
            stockInventory.put(id, product);
            System.out.printf("%s was successfully added to the list %n", name);
        }
        showInventoryManagement();
    }

    public void updateStock() {
        System.out.print("Enter product id:");
        int id = scanner.nextInt();
        System.out.print("Enter stock qty:");
        int qty = scanner.nextInt();

        if(stockInventory.get(id) == null) {
            System.out.printf("Product with id %d was not found in list %n", id);
        } else {
            Product product = stockInventory.get(id);
            product.setQty(product.getQty() + qty);
            stockInventory.put(id, product);
            System.out.printf("%d product qty was updated %n", id);
        }
        showInventoryManagement();
    }

    public void removeProduct() {
        System.out.print("Enter product id:");
        int id = scanner.nextInt();

        if(stockInventory.get(id) == null) {
            System.out.printf("Product with id %d was not found in list %n", id);
        } else {
            stockInventory.remove(id);
            System.out.printf("%d product was successfully removed %n", id);
        }
        showInventoryManagement();
    }

    private void showReports() {
        System.out.println("1.Stock Inventory Report");
        System.out.println("2.Sales Invoice Report");
        System.out.println("3.Back");
        System.out.println("4.Logout");
        System.out.println("Please select the option:");
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                showStockInventoryReport();
                break;
            case 2:
                showSalesInvoiceReport();
                break;
            case 3:
                showBackOption();
                break;
            case 4:
                logout();
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public void showStockInventoryReport() {
        System.out.println("**************************************************************************");
        System.out.println("|                        STOCK INVENTORY REPORT                          |");
        System.out.println("**************************************************************************");
        System.out.printf("| %-8s | %-25s | %-10s | %-15s |%n", "ITEM_ID", "ITEM_NAME", "UNIT PRICE", "AVAILABLE QUANTITY");
        System.out.println("**************************************************************************");
        for(Product product : stockInventory.values()) {
            System.out.printf("| %-8s | %-25s | %-10s | %-18s |%n",String.valueOf(product.getId()), product.getName(),
                    String.valueOf(product.getPrice()), String.valueOf(product.getQty()));
        }
        System.out.println("**************************************************************************");
        showReports();
    }

    public void showSalesInvoiceReport() {
        System.out.println("*********************************************************************************************************");
        System.out.println("|                                        SALES INVOICE REPORT                                           |");
        System.out.println("*********************************************************************************************************");
        System.out.printf("| %-36s | %-8s | %-15s | %-8s | %-8s | %-11s |%n", "CART_ID", "ITEM_ID", "ITEM_NAME", "PRICE", "QUANTITY", "TOTAL PRICE");
        System.out.println("*********************************************************************************************************");
        Map<String, List<SaleItem>> sales = salesInventory.getSales();
        Set<String> keys = sales.keySet();
        for(String key: keys) {
            List<SaleItem> saleItems = sales.get(key);
            for(SaleItem saleItem: saleItems) {
                System.out.printf("| %-36s | %-8s | %-15s | %-8s | %-8s | %-11s |%n", key, String.valueOf(saleItem.getProductId()), saleItem.getProductName(),
                        String.valueOf(saleItem.getPrice()), String.valueOf(saleItem.getQty()), String.valueOf(saleItem.getPrice() * saleItem.getQty()));
            }
        }
        System.out.println("*********************************************************************************************************");
        System.out.printf("| Total Amount: %-80s        |%n", String.valueOf(salesInventory.getTotalSalesAmount()));
        System.out.println("*********************************************************************************************************");
        showReports();
    }

    private void showBackOption() {
        showListOptions();
    }

    private void logout() {
        isLogout = true;
    }
}

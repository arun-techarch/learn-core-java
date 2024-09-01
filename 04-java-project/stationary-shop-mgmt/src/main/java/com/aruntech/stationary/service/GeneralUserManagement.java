package com.aruntech.stationary.service;

import java.util.*;
import com.aruntech.stationary.model.*;

public class GeneralUserManagement extends AbstractUserManagement {
    private CartItem cartItem;
    private boolean resetCart = true;

    public GeneralUserManagement(Scanner scanner, User user, SalesInventory inventory, Map<Integer, Product> stockInventory) {
        super(scanner, user, inventory, stockInventory);
    }

    public void setLoggedInUser(User user) {
        this.user = user;
    }

    @Override
    public void showListOptions() {
        System.out.println("1.Available Products");
        System.out.println("2.Purchase");
        System.out.println("3.View Cart");
        System.out.println("4.Payment");
        System.out.println("5.Logout");
        System.out.println("Please select the option:");
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                showAvailableProducts();
                break;
            case 2:
                purchaseProducts();
                break;
            case 3:
                showViewCart();
                break;
            case 4:
                payment();
                break;
            case 5:
                logout();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    protected void showAvailableProducts() {
        System.out.println("********************************************************************************************");
        System.out.println("|                                   AVAILABLE PRODUCTS                                     |");
        System.out.println("********************************************************************************************");
        System.out.printf("| %-8s | %-25s | %-20s | %-8s | %-15s |%n", "ITEM_ID", "ITEM_NAME", "BRAND", "PRICE", "AVAILABLE STOCK");
        System.out.println("********************************************************************************************");
        for(Product product : stockInventory.values()) {
            System.out.printf("| %-8s | %-25s | %-20s | %-8s | %-15s |%n", product.getId(), product.getName(),
                    product.getBrandName(), String.valueOf(product.getPrice()), String.valueOf(product.getQty()));
        }
        System.out.println("********************************************************************************************");
        showBackOption();
    }

    protected void purchaseProducts() {
        //reset the cart items for initial load and after payment
        resetCartItems();

        System.out.print("Enter product id:");
        int id = scanner.nextInt();
        System.out.print("Enter product qty:");
        int qty = scanner.nextInt();

        if(stockInventory.get(id) == null) {
            System.out.printf("%d product was not exists %n", id);
        } else {
            Product product = stockInventory.get(id);
            if(product.getQty() < qty) {
                System.out.printf("%d product don't have enough stock to purchase %n", id);
            } else {
                product.setQty(product.getQty() - qty);
                stockInventory.put(id, product);
                SaleItem saleItem = new SaleItem(product.getId(), product.getName(), product.getPrice(), qty);
                cartItem.addItemToCart(saleItem);
                System.out.printf("%d product successfully added to the cart %n", id);
            }
        }
        showBackOption();
    }

    protected void showViewCart() {
        //reset the cart items for initial load and after payment
        resetCartItems();
        System.out.println("*****************************************************************************");
        System.out.println("|                              VIEW CART ITEMS                              |");
        System.out.println("*****************************************************************************");
        System.out.printf("| Cart ID: %-64s |%n", cartItem.getId());
        System.out.printf("| User ID: %-64s |%n", String.valueOf(cartItem.getUserId()));
        System.out.printf("| User Name: %-62S |%n", cartItem.getUserName());
        System.out.println("*****************************************************************************");
        System.out.printf("| %-8s | %-25s | %-10s | %-8s | %-10s |%n", "ITEM_ID", "ITEM_NAME", "PRICE", "QUANTITY", "TOTAL");
        System.out.println("*****************************************************************************");
        for(SaleItem saleItem : cartItem.getSaleItems()) {
            System.out.printf("| %-8s | %-25s | %-10s | %-8s | %-10s |%n",String.valueOf(saleItem.getProductId()), saleItem.getProductName(),
                    String.valueOf(saleItem.getPrice()), String.valueOf(saleItem.getQty()), String.valueOf(saleItem.getPrice() * saleItem.getQty()));
        }
        System.out.println("*****************************************************************************");
        System.out.printf("| Total Price: %-60s |%n", String.valueOf(cartItem.getPrice()));
        System.out.println("*****************************************************************************");
        showBackOption();
    }

    protected void payment() {
        //reset the cart items for initial load and after payment
        resetCartItems();
        if(cartItem.getSaleItems().size() == 0) {
            System.out.println("Cart item is empty...");
            showBackOption();
        } else {
            System.out.println("Payable amount:" + cartItem.getPrice());
            System.out.print("Enter the amount to pay:");
            double amount = scanner.nextDouble();

            if(cartItem.getPrice() == amount) {
                System.out.println("Successfully paid the amount and balance given is null");
                addSalesInventory();
            } else if(cartItem.getPrice() < amount) {
                System.out.println("Successfully paid the amount and balance amount is:"+(amount - cartItem.getPrice()));
                addSalesInventory();
            } else if(cartItem.getPrice() > amount) {
                System.out.println("Insufficient amount to pay.");
                showBackOption();
            }
        }
    }

    private void logout() {
        isLogout = true;
    }

    private void addSalesInventory() {
        salesInventory.addSalesDetails(cartItem);
        resetCart = true;
        showBackOption();
    }

    private void resetCartItems() {
        if(resetCart) {
            resetCart = false;
            cartItem = new CartItem(UUID.randomUUID().toString(), user.getId(), user.getUserName());
        }
    }

    private void showBackOption() {
        showListOptions();
    }
}

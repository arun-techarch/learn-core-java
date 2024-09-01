package com.aruntech.stationary.service;

import java.util.Map;
import java.util.Scanner;
import com.aruntech.stationary.model.User;
import com.aruntech.stationary.model.Product;
import com.aruntech.stationary.model.SalesInventory;

public abstract class AbstractUserManagement {
    protected User user;
    protected Scanner scanner = null;
    protected boolean isLogout = false;
    protected SalesInventory salesInventory;
    protected Map<Integer, Product> stockInventory;

    public AbstractUserManagement(Scanner scanner, User user, SalesInventory inventory, Map<Integer, Product> stockInventory) {
        this.user = user;
        this.scanner = scanner;
        this.salesInventory = inventory;
        this.stockInventory = stockInventory;
        isLogout = false;
    }

    public boolean isLogout() {
        return isLogout;
    }

    public void setLogout(boolean isLogout) {
        this.isLogout = isLogout;
    }

    protected void exit() {
        System.exit(0);
    }

    public abstract void showListOptions();

}

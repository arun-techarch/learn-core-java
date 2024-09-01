package com.aruntech.stationary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import com.aruntech.stationary.service.*;
import com.aruntech.stationary.model.User;
import com.aruntech.stationary.model.Product;
import com.aruntech.stationary.model.UserType;
import com.aruntech.stationary.model.SalesInventory;

public class StationaryShopManagement {
    private User userProfile;
    private AbstractLoginService loginService;
    private GeneralUserManagement guestUserManagement;
    private AdminUserManagement adminUserManagement;
    private Scanner scanner = new Scanner(System.in);
    private SalesInventory salesInventory = new SalesInventory();
    private Map<Integer, Product> stockInventory = getInitialProductList();

    //initially loading some products
    public Map<Integer, Product> getInitialProductList() {
        Map<Integer, Product> products = new HashMap<>();
        products.put(10, new Product(10, "Lipstick", "Diva", 10, 50.00));
        products.put(22, new Product(22, "Pencil", "Apsara", 50, 75.50));
        products.put(15, new Product(15, "Sandal", "VKC", 10, 120.0));
        products.put(12, new Product(12, "Notebook", "Classmate", 30, 45.75));
        products.put(5, new Product(5, "Paper", "TNPL", 20, 30.50));
        products.put(3, new Product(3, "Eraser", "Camel", 50, 5.00));
        products.put(7, new Product(7, "Soap", "Lux", 50, 75.50));
        products.put(17, new Product(17, "Facecream", "Ponds", 20, 70.50));
        return products;
    }

    private AbstractLoginService getLoginService() {
        if(loginService == null) {
            loginService = new LoginService(scanner);
        }
        loginService.setUserLoggedIn(false);
        return loginService;
    }

    private AbstractUserManagement getUserManagement(User user) {
        if(userProfile.getUserType() == UserType.ADMIN) {
            if(adminUserManagement == null) {
                adminUserManagement = new AdminUserManagement(scanner, user, salesInventory, stockInventory);
            }
            return adminUserManagement;
        } else {
            if(guestUserManagement == null) {
                guestUserManagement = new GeneralUserManagement(scanner, user, salesInventory, stockInventory);
            }
            guestUserManagement.setLoggedInUser(user);
            return guestUserManagement;
        }
    }

    private void start() {
        //login to the application
        loginService = getLoginService();
        while(!loginService.getUserLoggedIn()) {
            loginService.showLoginOptions();
        }

        //get the user logged in details
        userProfile = loginService.getUserProfile();
        //show the ADMIN or USER options to proceed
        AbstractUserManagement userManagement = getUserManagement(userProfile);
        userManagement.showListOptions();
        while(userManagement.isLogout()) {
            start();
        }
    }

    public static void main(String[] args) {
        StationaryShopManagement stationaryShopManagement = new StationaryShopManagement();
        stationaryShopManagement.start();
    }
}

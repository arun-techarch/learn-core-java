package com.aruntech.stationary.service;

import java.util.Scanner;
import com.aruntech.stationary.model.User;

public abstract class AbstractLoginService {
    protected User userProfile;
    protected Scanner scanner = null;
    protected boolean isLoggedIn = false;

    public AbstractLoginService(Scanner scanner) {
        this.scanner = scanner;
        this.isLoggedIn = false;
    }

    public void showLoginOptions() {
        System.out.println("1.Signup");
        System.out.println("2.Login");
        System.out.println("3.Exit");
        System.out.println("Please select the option:");
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                signupUser();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                exit();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    private void loginUser() {
        boolean loggedIn = validateUser();
        if(!loggedIn) {
            loginUser();
        } else {
            isLoggedIn = true;
        }
    }

    private void signupUser() {
        boolean signUp = validateSignup();
        if(!signUp) {
            signupUser();
        } else {
            showLoginOptions();
        }
    }

    protected void exit() {
        isLoggedIn = false;
        System.exit(0);
    }

    public boolean getUserLoggedIn() {
        return isLoggedIn;
    }

    public void setUserLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public User getUserProfile() {
        return userProfile;
    }

    //abstract methods
    protected abstract boolean validateUser();
    protected abstract boolean validateSignup();
}

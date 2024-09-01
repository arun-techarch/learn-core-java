package com.aruntech.stationary.service;

import java.util.*;
import com.aruntech.stationary.model.User;
import com.aruntech.stationary.model.UserType;

public class LoginService extends AbstractLoginService {
    private Map<String, User> users = new HashMap<>();

    public LoginService(Scanner scanner) {
        super(scanner);
    }

    protected boolean validateSignup() {
        //get the user inputs
        System.out.print("Enter your username:");
        String username = scanner.next();
        System.out.print("Enter your password:");
        String password = scanner.next();
        System.out.print("Enter user type(Admin/User):");
        UserType userType = scanner.next().equalsIgnoreCase("admin") ? UserType.ADMIN : UserType.USER;

        //validate the user details
        if(username.trim().length() == 0 || username.trim() == "" ||
            password.trim().length() == 0 || password.trim() == "") {
            System.out.println("Please enter the valid details");
            return false;
        } else {
            User user = new User();
            user.setId(new Random().nextInt(10000));
            user.setUserName(username);
            user.setPassword(password);
            user.setUserType(userType);

            //save the user
            users.put(user.getUserName(), user);
            System.out.printf("%s user saved successfully %n", username);
            return true;
        }
    }

    protected boolean validateUser() {
        //get the user credential
        System.out.print("Enter your username:");
        String username = scanner.next();
        System.out.print("Enter your password:");
        String password = scanner.next();

        User user = users.get(username);
        if(user == null) {
            System.out.printf("%s username is not found %n", username);
            return false;
        } else {
            if(user.getUserName().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
                //save the logged-in user as userProfile
                userProfile = user;
                System.out.printf("%s successfully logged-in %n", username);
                return true;
            } else {
                System.out.println("Invalid password so, please try again!!!");
                return false;
            }
        }
    }

}

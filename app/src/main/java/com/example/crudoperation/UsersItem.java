package com.example.crudoperation;

public class UsersItem {
    String userId;
    String userName;
    String userEmail;
    String Country;

    public UsersItem() {
    }

    public UsersItem(String userId, String userName, String userEmail, String country) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        Country = country;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}

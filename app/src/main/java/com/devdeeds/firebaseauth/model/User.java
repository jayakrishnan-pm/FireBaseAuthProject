package com.devdeeds.firebaseauth.model;
public class User {
    //email and address string
    private String email;
    private String password;
    private String name;

    public User() {
      /*Blank default constructor essential for Firebase*/
    }
    //Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
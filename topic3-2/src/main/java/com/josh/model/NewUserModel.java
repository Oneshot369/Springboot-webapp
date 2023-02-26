package com.josh.model;

public class NewUserModel {

    String Name;
    String LName;
    String Email;
    String Username;
    String Password;
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getLName() {
        return LName;
    }
    public void setLName(String lName) {
        LName = lName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "NewUserModel [Name=" + Name + ", LName=" + LName + ", Email=" + Email + ", Username=" + Username
                + ", Password=" + Password + "]";
    }
}

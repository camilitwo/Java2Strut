/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.utils;

/**
 *
 * @author CETECOM
 */
public class User {
    
    private String userName;
    private String name;
    private String lastName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User(String userName, String name, String lastName) {
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
    }

    public User() {
        
        this.lastName = "";
        this.name = "";
        this.userName = "";
    }

    
    
    
    
    
    
    
}

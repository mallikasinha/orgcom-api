/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orgcomsys.model;

import java.io.Serializable;

/**
 *
 * @author Mallika
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7822662745401268813L;
    
    private String fullName;
    private long mobileNo;
    private String address;
    private String username;
    private String emailAddress;
    private String password;

    public User(String fullName, long mobileNo, String address, String username, String emailAddress, String password) {
        this.fullName = fullName;
        this.mobileNo = mobileNo;
        this.address = address;
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

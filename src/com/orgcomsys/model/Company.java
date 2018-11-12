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
public class Company implements Serializable {

    private static final long serialVersionUID = -1102361259523468659L;
    
    private String companyName;
    private String companyAddress;
    private long phoneNo;
    private long panNo;
    private String mailingAddress;

    public Company(String companyName, String companyAddress, long phoneNo, long panNo, String mailingAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.phoneNo = phoneNo;
        this.panNo = panNo;
        this.mailingAddress = mailingAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPanNo() {
        return panNo;
    }

    public void setPanNo(long panNo) {
        this.panNo = panNo;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }  
}

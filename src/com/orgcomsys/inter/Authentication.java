/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orgcomsys.inter;

import com.orgcomsys.model.Company;
import com.orgcomsys.model.Response;
import com.orgcomsys.model.User;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mallika
 */
public interface Authentication extends Remote {
    //user define class type
    Response signUp(User user, Company company) throws RemoteException;
    Response signIn(String username, String password) throws RemoteException;
}

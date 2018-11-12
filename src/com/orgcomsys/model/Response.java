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
public class Response implements Serializable {

    private static final long serialVersionUID = -5454857458882386120L;
    
    private int code;
    private String status;

    public Response(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

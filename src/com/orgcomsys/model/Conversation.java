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
public class Conversation implements Serializable {
        private String message;
        
        private static final long serialVersionUID = -1102361259523468659L;

    public Conversation(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
        
        

    
}

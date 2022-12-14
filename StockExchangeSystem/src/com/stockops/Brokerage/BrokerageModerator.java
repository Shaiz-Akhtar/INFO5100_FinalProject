/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import com.stockops.Users.AppUser;

/**
 *
 * @author mridulregmi
 */
public class BrokerageModerator extends AppUser{
    private Brokerage brokerage;
    
    public BrokerageModerator(){
        
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brokerage getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(Brokerage brokerage) {
        this.brokerage = brokerage;
    }
    
}

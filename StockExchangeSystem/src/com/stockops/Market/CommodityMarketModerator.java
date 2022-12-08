/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import com.stockops.Users.AppUser;

/**
 *
 * @author mridulregmi
 */
public class CommodityMarketModerator extends AppUser{
    private CommodityMarket marketAssigned;
    public CommodityMarketModerator(){
        
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

    public CommodityMarket getMarketAssigned() {
        return marketAssigned;
    }

    public void setMarketAssigned(CommodityMarket marketAssigned) {
        this.marketAssigned = marketAssigned;
    }
    
}

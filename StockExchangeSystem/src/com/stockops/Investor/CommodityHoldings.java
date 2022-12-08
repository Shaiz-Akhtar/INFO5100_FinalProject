/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Investor;

import com.stockops.Market.Commodity;
import com.stockops.Market.Equity;

/**
 *
 * @author mridulregmi
 */
public class CommodityHoldings {
    Commodity commodity;
    int quantity;
    double buyingPrice;
    public CommodityHoldings(){
        
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    
    
    
}

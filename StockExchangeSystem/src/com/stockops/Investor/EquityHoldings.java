/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Investor;

import com.stockops.Market.Equity;

/**
 *
 * @author Shaiz
 */
public class EquityHoldings {
    Equity equity;
    int quantity; 
    double buyingPrice;
    public EquityHoldings(){
        quantity=0;
        buyingPrice=0;
    }

    public Equity getEquity() {
        return equity;
    }

    public void setEquity(Equity equity) {
        this.equity = equity;
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

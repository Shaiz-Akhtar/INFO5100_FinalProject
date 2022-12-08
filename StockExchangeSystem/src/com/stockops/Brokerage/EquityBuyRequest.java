/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import com.stockops.Investor.Investor;
import com.stockops.Investor.InvestorAbstract;
import com.stockops.Market.Equity;

/**
 *
 * @author mridulregmi
 */
public class EquityBuyRequest {
    private int id;
    private InvestorAbstract seller;
    private InvestorAbstract buyer;
    private Equity equity;
    private int quantity;

    public EquityBuyRequest() {
        seller=null;
    }

    public EquityBuyRequest(InvestorAbstract seller, InvestorAbstract buyer, Equity equity, int quantity) {
        this.seller = seller;
        this.buyer = buyer;
        this.equity = equity;
        this.quantity = quantity;
    }

    public InvestorAbstract getSeller() {
        return seller;
    }

    public void setSeller(InvestorAbstract seller) {
        this.seller = seller;
    }

    public InvestorAbstract getBuyer() {
        return buyer;
    }

    public void setBuyer(InvestorAbstract buyer) {
        this.buyer = buyer;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

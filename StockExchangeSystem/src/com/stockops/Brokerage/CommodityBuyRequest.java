/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import com.stockops.Investor.Investor;
import com.stockops.Investor.InvestorAbstract;
import com.stockops.Market.Commodity;

/**
 *
 * @author mridulregmi
 */
public class CommodityBuyRequest {
    private int id;
    private Investor seller;
    private InvestorAbstract buyer;
    private Commodity commodity;
    private int quantity;
    public CommodityBuyRequest(){
        
    }

//    public CommodityBuyRequest(Investor seller, Investor buyer, Commodity commodity, int quantity) {
//        this.seller = seller;
//        this.buyer = buyer;
//        this.commodity = commodity;
//        this.quantity = quantity;
//    }

    public Investor getSeller() {
        return seller;
    }

    public void setSeller(Investor seller) {
        this.seller = seller;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InvestorAbstract getBuyer() {
        return buyer;
    }

    public void setBuyer(InvestorAbstract buyer) {
        this.buyer = buyer;
    }
    
}

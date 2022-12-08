/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import com.stockops.Establishments.Company;

/**
 *
 * @author mridulregmi
 */
public class ListingRequest {
    private int requestId;
    private Company company;
    private Double pricePerShare;
    private int totalShares;
    private String status;
    
    public ListingRequest(Company company, Double pricePerShare, int totalShares ){
        this.company=company;
        this.pricePerShare=pricePerShare;
        this.totalShares=totalShares;
        this.status="Pending";
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(Double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    
}

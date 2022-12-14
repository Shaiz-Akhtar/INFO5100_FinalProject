/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import com.stockops.Users.AppUser;
import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class EquityMarketModerator extends AppUser{
    int requestCount=0;
    private EquityMarket assignedMarket;
    private ArrayList<ListingRequest> listingRequestList;
    
    public EquityMarketModerator(){
        listingRequestList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public EquityMarket getAssignedMarket() {
        return assignedMarket;
    }

    public void setAssignedMarket(EquityMarket assignedMarket) {
        this.assignedMarket = assignedMarket;
    }

    public ArrayList<ListingRequest> getListingRequestList() {
        return listingRequestList;
    }

    public void setListingRequestList(ArrayList<ListingRequest> listingRequestList) {
        this.listingRequestList = listingRequestList;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }
    
    public ListingRequest getListingRequestById(int id){
        for(ListingRequest listingRequest: this.listingRequestList){
          if(listingRequest.getRequestId()==id){
              return listingRequest;
          }  
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Roles;

import com.stockops.Business.EcoSystem;
import com.stockops.Users.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mridulregmi
 */
public abstract class Role {
    public enum RoleType{
        BrokerageModerator("BrokerageModerator"), //this
        CommodityBroker("CommodityBroker"),
        EquityBroker("EquityBroker"),
        EstablishmentsModerator("EstablishmentsModerator"), //this
        CompanyManager("CompanyManager"),
        InvestmentManager("InvestmentManager"),
        DayTrader("DayTrader"),
        RetailInvestor("RetailInvestor"),
        CommodityMarketModerator("CommodityMarketModerator"), //this
        EquityMarketModerator("EquityMarketModerator"); //this
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);
    
}

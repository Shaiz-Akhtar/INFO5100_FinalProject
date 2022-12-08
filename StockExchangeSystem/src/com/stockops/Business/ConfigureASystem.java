/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Business;

import com.stockops.Brokerage.Brokerage;
import com.stockops.Brokerage.BrokerageModerator;
import com.stockops.Establishments.Establishment;
import com.stockops.Establishments.EstablishmentsModerator;
import com.stockops.Investor.DayTrader;
import com.stockops.Investor.Investor;
import com.stockops.Market.CommodityMarket;
import com.stockops.Market.CommodityMarketModerator;
import com.stockops.Market.EquityMarket;
import com.stockops.Market.EquityMarketModerator;
import com.stockops.Market.Market;
import com.stockops.Roles.BrokerageModeratorRole;
import com.stockops.Roles.CommodityMarketModeratorRole;
import com.stockops.Roles.EquityMarketModeratorRole;
import com.stockops.Roles.EstablishmentsModeratorRole;
import com.stockops.Roles.MarketAnalyst;


/**
 *
 * @author mridulregmi
 */
public class ConfigureASystem {

    public static EcoSystem configure(){
        
        EcoSystem system = new EcoSystem();
        
        //Configure the market enterprise
        Market market = new Market();
        
        EquityMarket equityMarket = new EquityMarket();
        CommodityMarket commodityMarket = new CommodityMarket();
        
        CommodityMarketModerator commodityMarketModerator = new CommodityMarketModerator();
        
        commodityMarketModerator.setName("Commodity Futures Trading Commission");
        commodityMarketModerator.setUserId(getUserCount(system));
        
        system.getUserDirectory().createUserAccount("ctc", "ctc123", commodityMarketModerator, new CommodityMarketModeratorRole());
        
        EquityMarketModerator equityMarketModerator = new EquityMarketModerator();
        system.getUserDirectory().createUserAccount("sebi", "sebi123", equityMarketModerator, new EquityMarketModeratorRole());
        equityMarketModerator.setName("Securities Exchange Board");
        equityMarketModerator.setUserId(getUserCount(system));
        
        equityMarketModerator.setAssignedMarket(equityMarket);
        commodityMarketModerator.setMarketAssigned(commodityMarket);
        
        equityMarket.setEquityMarketModerator(equityMarketModerator);
        commodityMarket.setCommodityMarketModerator(commodityMarketModerator);
        
        market.setEquityMarket(equityMarket);
        market.setCommodityMarket(commodityMarket);
        
        system.setMarket(market);
        
        
        //Configure the brokerage enterprise
        Brokerage brokerage = new Brokerage();
        
        BrokerageModerator brokerageModerator = new BrokerageModerator();
        brokerageModerator.setName("Brokerage Commission");
        brokerageModerator.setUserId(getUserCount(system));
        system.getUserDirectory().createUserAccount("brokeradmin", "brokeradmin", brokerageModerator, new BrokerageModeratorRole());
        
        brokerage.setBrokerageModerator(brokerageModerator);
        brokerageModerator.setBrokerage(brokerage);
        
        system.setBrokerage(brokerage);
        
        //Configure investor enterprise
        Investor investor = new Investor();
        system.setInvestor(investor);
        
        //Configure Establishments
        Establishment establishment = new Establishment();
        
        EstablishmentsModerator establishmentsModerator = new EstablishmentsModerator();
        establishmentsModerator.setName("Establishments Moderator");
        establishmentsModerator.setUserId(getUserCount(system));
        system.getUserDirectory().createUserAccount("llc", "llc", establishmentsModerator, new EstablishmentsModeratorRole());
        
        establishment.setEstablishmentsModerator(establishmentsModerator);
        establishmentsModerator.setEstablishment(establishment);
        
        DayTrader marketAnalyst = new DayTrader();
        marketAnalyst.setName("Market Analyst");
        marketAnalyst.setUserId(getUserCount(system));
        system.getUserDirectory().createUserAccount("analyst", "analyst", marketAnalyst, new MarketAnalyst());
        
        system.getMarket().getEquityMarket().getMarketList().add("National Stock Exchange");
        system.getMarket().getEquityMarket().getMarketList().add("Bombay Stock Exchange");
        
        
        system.setEstablishment(establishment);
        
        return system;
    }

    private static int getUserCount(EcoSystem system) {
        system.setUserCount(system.getUserCount()+1);
        return(system.getUserCount());
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.UI.Brokers;

import com.stockops.Brokerage.CommodityBroker;
import com.stockops.Brokerage.CommodityBuyRequest;
import com.stockops.Brokerage.CommoditySellRequest;
import com.stockops.Business.EcoSystem;
import com.stockops.Investor.CommodityHoldings;
import com.stockops.Investor.InvestorAbstract;
import com.stockops.Investor.RetailInvestor;
import com.stockops.Market.Commodity;
import com.stockops.Users.AppUser;
import com.stockops.Users.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mridulregmi
 */
public class CommodityBrokerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommodityBrokerJPanel
     */
    CommodityBroker commodityBroker;
    EcoSystem business;
    UserAccount user;
    public CommodityBrokerJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        this.user=account;
        this.commodityBroker=(CommodityBroker)this.user.getUser();
        this.business=business;
        initComponents();
        jLabel1.setText(this.commodityBroker.getName());
        jLabel4.setText(this.commodityBroker.getName());
        jLabel6.setText(this.commodityBroker.getName());
        populateCommoditiesTable();
        populateBuyRequestTable();
        populateSellRequestTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commodityTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sellRequestTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        buyRequestTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(54, 33, 98));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        commodityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Symbol", "Unit", "Price"
            }
        ));
        jScrollPane1.setViewportView(commodityTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 653, 160));

        jButton3.setBackground(new java.awt.Color(85, 65, 118));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sell Requests");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 130, 40));

        jButton4.setBackground(new java.awt.Color(85, 65, 118));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buy Requests");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 130, 40));

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1430, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(743, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Available Commodities:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        sellRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Buyer", "Commodity", "Quantity", "Units", "Price"
            }
        ));
        jScrollPane3.setViewportView(sellRequestTable);

        jButton1.setBackground(new java.awt.Color(85, 65, 118));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Process Sell Request");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Sell Request:");

        jButton7.setBackground(new java.awt.Color(85, 65, 118));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Reject Sell Request");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(85, 65, 118));
        jPanel5.setPreferredSize(new java.awt.Dimension(567, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("<< Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(252, 252, 252))))
        );

        add(jPanel2, "card3");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        buyRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Buyer", "Commodity", "Quantity", "Units", "Price"
            }
        ));
        jScrollPane2.setViewportView(buyRequestTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Buy Request:");

        jButton2.setBackground(new java.awt.Color(85, 65, 118));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Process Buy Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(85, 65, 118));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Reject Buy Request");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(85, 65, 118));
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 80));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("<< Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(662, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jButton2)
                        .addGap(81, 81, 81)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(239, 239, 239))))
        );

        add(jPanel3, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(buyRequestTable.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to process");
            return;

        }
        CommodityBuyRequest buyRequest = this.commodityBroker.getBuyRequestById(Integer.parseInt(String.valueOf(buyRequestTable.getValueAt(buyRequestTable.getSelectedRow(), 0))));
        CommodityHoldings holdingToAdd = new CommodityHoldings();
        Boolean addNewFlag =true;
        for(CommodityHoldings commodityHoldings:((RetailInvestor)buyRequest.getBuyer()).getCommodityHoldings()){
            if(commodityHoldings.getCommodity()==buyRequest.getCommodity()){
                holdingToAdd=commodityHoldings;
                addNewFlag=false;
            }
        }
        double price = ((holdingToAdd.getBuyingPrice()*holdingToAdd.getQuantity())+(buyRequest.getQuantity()*buyRequest.getCommodity().getPrice()))/(holdingToAdd.getQuantity()+buyRequest.getQuantity());
        holdingToAdd.setQuantity(holdingToAdd.getQuantity()+buyRequest.getQuantity());
        holdingToAdd.setBuyingPrice(price);
        if(addNewFlag){
            holdingToAdd.setCommodity(buyRequest.getCommodity());
            ((RetailInvestor)buyRequest.getBuyer()).getCommodityHoldings().add(holdingToAdd);
        }
        this.commodityBroker.getBuyRequests().remove(this.commodityBroker.getBuyRequestById(buyRequest.getId()));
        populateBuyRequestTable();
        populateSellRequestTable();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(sellRequestTable.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to process");
            return;

        }
        CommoditySellRequest sellRequest = this.commodityBroker.getSellRequestById(Integer.parseInt(String.valueOf(sellRequestTable.getValueAt(sellRequestTable.getSelectedRow(), 0))));
        CommodityHoldings holdingToSell = new CommodityHoldings();
        for(CommodityHoldings commodityHoldings:((RetailInvestor)sellRequest.getSeller()).getCommodityHoldings()){
            if(commodityHoldings.getCommodity()==sellRequest.getCommodity()){
                holdingToSell=commodityHoldings;
            }
        }
        holdingToSell.setQuantity(holdingToSell.getQuantity()-sellRequest.getQuantity());
        if(holdingToSell.getQuantity()==0){
            ((RetailInvestor)sellRequest.getSeller()).getCommodityHoldings().remove(holdingToSell);
        }
        this.commodityBroker.getSellRequests().remove(sellRequest);
        populateBuyRequestTable();
        populateSellRequestTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        changePage(jPanel2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        changePage(jPanel3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        changePage(jPanel1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        changePage(jPanel1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(sellRequestTable.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to process");
            return;

        }
        CommoditySellRequest sellRequest = this.commodityBroker.getSellRequestById(Integer.parseInt(String.valueOf(sellRequestTable.getValueAt(sellRequestTable.getSelectedRow(), 0))));
        InvestorAbstract seller = sellRequest.getSeller();
        seller.setBalance(seller.getBalance()+(sellRequest.getQuantity()*sellRequest.getCommodity().getPrice()));
        sellRequest.getSeller().getCommoditySellRequests().remove(sellRequest);
        this.commodityBroker.getSellRequests().remove(sellRequest);
        JOptionPane.showMessageDialog(this, "Request Rejected and Deleted!");
        populateSellRequestTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

if(buyRequestTable.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to process");
            return;

        }
        CommodityBuyRequest buyRequest = this.commodityBroker.getBuyRequestById(Integer.parseInt(String.valueOf(buyRequestTable.getValueAt(buyRequestTable.getSelectedRow(), 0))));
        InvestorAbstract buyer=buyRequest.getBuyer();
        buyer.setBalance(buyer.getBalance()+(buyRequest.getQuantity()*buyRequest.getCommodity().getPrice()));
        buyRequest.getBuyer().getCommodityBuyRequests().remove(buyRequest);
        this.commodityBroker.getBuyRequests().remove(buyRequest);
        JOptionPane.showMessageDialog(this, "Request Rejected and Deleted!");
        populateBuyRequestTable();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable buyRequestTable;
    private javax.swing.JTable commodityTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable sellRequestTable;
    // End of variables declaration//GEN-END:variables

    private void populateCommoditiesTable() {
        DefaultTableModel model = (DefaultTableModel) commodityTable.getModel();
        model.setRowCount(0);
        for(Commodity commodity:this.business.getMarket().getCommodityMarket().getCommodityList()){
            Object[] row=new Object[4];
            row[0]=commodity.getName();
            row[1]=commodity.getSymbol();
            row[2]=commodity.getUnit();
            row[3]=commodity.getPrice();
            model.addRow(row);
        }
    }

    private void populateBuyRequestTable() {
       DefaultTableModel model = (DefaultTableModel) buyRequestTable.getModel();
       model.setRowCount(0);
       for(CommodityBuyRequest commodityBuyRequest:this.commodityBroker.getBuyRequests()){
           Object[] row= new Object[6];
           row[0] = commodityBuyRequest.getId();
           row[1] = commodityBuyRequest.getBuyer().getName();
           row[2] = commodityBuyRequest.getCommodity().getName();
           row[3] = commodityBuyRequest.getQuantity();
           row[4] = commodityBuyRequest.getCommodity().getUnit();
           row[5] = commodityBuyRequest.getCommodity().getPrice()*commodityBuyRequest.getQuantity();
           model.addRow(row);
       }
    }

    private void populateSellRequestTable() {
        DefaultTableModel model = (DefaultTableModel) sellRequestTable.getModel();
       model.setRowCount(0);
       for(CommoditySellRequest commoditySellRequest:this.commodityBroker.getSellRequests()){
           Object[] row= new Object[6];
           row[0] = commoditySellRequest.getId();
           row[1] = commoditySellRequest.getSeller().getName();
           row[2] = commoditySellRequest.getCommodity().getName();
           row[3] = commoditySellRequest.getQuantity();
           row[4] = commoditySellRequest.getCommodity().getUnit();
           row[5] = commoditySellRequest.getCommodity().getPrice()*commoditySellRequest.getQuantity();
           model.addRow(row);
       }
    }

    private void changePage(JPanel jPanel) {
        this.removeAll();
        this.add(jPanel);
        this.revalidate();
        this.repaint();
    }
}

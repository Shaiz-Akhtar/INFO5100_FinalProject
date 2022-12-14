/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Roles;

import com.stockops.Business.EcoSystem;
import com.stockops.UI.CompanyManger.CompanyManagerJPanel;
import com.stockops.Users.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author Shaiz
 */
public class CompanyManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CompanyManagerJPanel(userProcessContainer, account, business); //To change body of generated methods, choose Tools | Templates.
    }
    
}

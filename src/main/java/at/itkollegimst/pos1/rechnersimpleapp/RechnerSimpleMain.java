/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.itkollegimst.pos1.rechnersimpleapp;

import at.itkollegimst.pos1.rechnersimpleapp.dto.CalcDTO;
import at.itkollegimst.pos1.rechnersimpleapp.ui.IUserInterface;
import at.itkollegimst.pos1.rechnersimpleapp.ui.TextUserInterface;

/**
 *
 * @author intruder
 */
public class RechnerSimpleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        IUserInterface ui = new TextUserInterface();
        
        ui.init();
        CalcDTO userData = ui.getUserData();
        

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.itkollegimst.pos1.rechnersimpleapp;

import at.itkollegimst.pos1.rechnersimpleapp.dto.CalcDTO;
import at.itkollegimst.pos1.rechnersimpleapp.engine.CalcMethodAdd;
import at.itkollegimst.pos1.rechnersimpleapp.engine.ICalcMethod;
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
      
        Double result = 0.0;
        IUserInterface ui = new TextUserInterface();
        ICalcMethod adder = new CalcMethodAdd();
        Double[] numbers = {0.0, 0.0};
        
        ui.init();
        CalcDTO userData = ui.getUserData();
        
        numbers[0] = userData.getFirstNum();
        numbers[1] = userData.getSecondNum();
         
        switch (userData.getCalcMethod()) {
            case
                    "add": result = adder.doCalculation(numbers);
        }
        
        // FIXME: should use "ui" -> add output method in ui!
        System.out.println(result);
    }
    
}

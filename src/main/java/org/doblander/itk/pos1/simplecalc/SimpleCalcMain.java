/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.itk.pos1.simplecalc;

import org.doblander.itk.pos1.simplecalc.dto.CalcDTO;
import org.doblander.itk.pos1.simplecalc.engine.CalcMethodAdd;
import org.doblander.itk.pos1.simplecalc.engine.ICalcMethod;
import org.doblander.itk.pos1.simplecalc.ui.IUserInterface;
import org.doblander.itk.pos1.simplecalc.ui.TextUserInterface;

/**
 *
 * @author intruder
 */
public class SimpleCalcMain {

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

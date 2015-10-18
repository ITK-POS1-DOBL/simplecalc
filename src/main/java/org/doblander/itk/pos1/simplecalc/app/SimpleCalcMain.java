/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.itk.pos1.simplecalc.app;

import org.doblander.itk.pos1.simplecalc.engine.BasicCalculator;
import org.doblander.itk.pos1.simplecalc.engine.ICalculator;
import org.doblander.itk.pos1.simplecalc.service.CalcDTO;
import org.doblander.itk.pos1.simplecalc.ui.IUserInterface;
import org.doblander.itk.pos1.simplecalc.ui.TextUserInterface;

/**
 * An app for demonstrating simplel OOP principles in a concrete setting of a simple calculator.
 * 
 * @author intruder
 */
public class SimpleCalcMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        double result = 0.0;
        IUserInterface ui = new TextUserInterface();
        ICalculator basicCalc = new BasicCalculator();
        double[] numbers = {0.0, 0.0};
        
        ui.init();
        ui.welcome();
        
        CalcDTO userData = ui.getUserData();
        
        numbers[0] = userData.getFirstNum();
        numbers[1] = userData.getSecondNum();
         
        switch (userData.getCalcMethod()) {
            case
                    "add": result = basicCalc.add(numbers);
        }
        
        // FIXME: should use "ui" -> add output method in ui!
        System.out.println(result);
    }
    
}

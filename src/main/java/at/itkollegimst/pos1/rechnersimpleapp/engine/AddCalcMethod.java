/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.itkollegimst.pos1.rechnersimpleapp.engine;

/**
 *
 * @author intruder
 */
public class AddCalcMethod implements ICalcMethod {

    @Override
    public double doCalculation(Double[] numbers) {
        int i;
        Double result = 0.0;
        
        for (i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        
        return result;
    }
    
}

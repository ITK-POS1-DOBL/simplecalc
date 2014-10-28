/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.itkollegimst.pos1.rechnersimpleapp.dto;

import at.itkollegimst.pos1.rechnersimpleapp.engine.ICalcMethod;

/**
 * Data Transfer Object for communication with user interface
 * @author intruder
 */
public class CalcDTO {
   private double firstNum;
   private double secondNum;
   private ICalcMethod calcMethod;
   private Boolean quit;
   
   public double getFirstNum() {
       return firstNum;
   }

    public double getSecondNum() {
        return secondNum;
    }

    public Boolean getQuit() {
        return quit;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public void setQuit(Boolean quit) {
        this.quit = quit;
    }

    public void setCalcMethod(ICalcMethod calcMethod) {
        this.calcMethod = calcMethod;
    }

    public ICalcMethod getCalcMethod() {
        return calcMethod;
    }
   
   
}

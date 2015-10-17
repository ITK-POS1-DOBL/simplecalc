/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.itk.pos1.simplecalc.dto;

/**
 * Data Transfer Object for communication with user interface
 * @author intruder
 */
public class CalcDTO {
   private double firstNum;
   private double secondNum;
   private String calcMethod;
   private Boolean quit = false;
   
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

    public void setCalcMethod(String calcMethod) {
        this.calcMethod = calcMethod;
    }

    public String getCalcMethod() {
        return calcMethod;
    }
   
   
}

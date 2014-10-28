/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.itkollegimst.pos1.rechnersimpleapp.ui;

import at.itkollegimst.pos1.rechnersimpleapp.dto.CalcDTO;
import at.itkollegimst.pos1.rechnersimpleapp.engine.CalcMethodAdd;
import at.itkollegimst.pos1.rechnersimpleapp.engine.ICalcMethod;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author intruder
 */
public class TextUserInterface implements IUserInterface {
    private CalcDTO userData;
    private static BufferedReader textIn;
    
    @Override
    public void init() {
        
        // Create CalcDTO instance for userData
        userData = new CalcDTO();
        
        // Create input reader
        textIn = new BufferedReader(new InputStreamReader(System.in));
        
        // create nice welcome page and user information for exiting
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("=================================");
        System.out.println();
        System.out.println("To end program enter 'quit' at any prompt");
        System.out.println();
        
        // get ready to input calculation method
        System.out.println("Please choose calculation method (add, sub, mul, div)");
    
    }

    @Override
    public void tearDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CalcDTO getUserData() {
      
        // read in calc method
        userData.setCalcMethod(readSingleUserInput());
        
        // read first number
        userData.setFirstNum(Double.parseDouble(readSingleUserInput()));
        
        // read second number
        userData.setSecondNum(Double.parseDouble(readSingleUserInput()));
        
        return userData;

    }

    @Override
    public void outputErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    private String readSingleUserInput(){
        String inString = "";
        
        try {
          inString = textIn.readLine();
        }
        catch (IOException e) {
            System.out.println();
            System.out.println("There was an error reading the input!");
            System.out.println();
        }
        
        return inString;
    }
}

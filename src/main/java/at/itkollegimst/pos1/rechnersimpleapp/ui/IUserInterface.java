/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.itkollegimst.pos1.rechnersimpleapp.ui;

import at.itkollegimst.pos1.rechnersimpleapp.dto.CalcDTO;

/**
 *
 * @author intruder
 */
public interface IUserInterface {
  
    public void init();
    public void tearDown();
    public CalcDTO getUserData();
    public void outputErrorMsg(String errorMsg);
}

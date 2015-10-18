/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.itk.pos1.simplecalc.ui;

import org.doblander.itk.pos1.simplecalc.service.CalcDTO;

/**
 *
 * @author intruder
 */
public interface IUserInterface {
  
    public void init();
    public void welcome();
    public void tearDown();
    public CalcDTO getUserData();
    public void outputErrorMsg(String errorMsg);
	
}

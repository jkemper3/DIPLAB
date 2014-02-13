/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author jkemper3
 */
public class GuiMessageReader implements MessageReader{
    
    private String keyboardReader;
    
    @Override
   public String getMessage(){
        
    keyboardReader =JOptionPane.showInputDialog("Please enter a message: ");
    return keyboardReader;
        
    }
}

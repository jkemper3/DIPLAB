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
public class GuiWriter implements MessageWriter {
    
     @Override
     public void writeMessage(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}

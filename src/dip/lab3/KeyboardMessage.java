/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author jkemper3
 */
public class KeyboardMessage {
    private String keyboardMessage;

    
    public String getMessage(){
        
       Scanner input = new Scanner (System.in);

        System.out.print("Enter Message: ");
        keyboardMessage = input.toString();

    return keyboardMessage;
    }
    

    public final void setKeyboardMessage(String message) {
        this.keyboardMessage = message;
    }
    
    
    
    
    
    
}

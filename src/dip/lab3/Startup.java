/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

/**
 *
 * @author jkemper3
 */
public class Startup {
    public static void main(String[] args) {
        
       MessageReader reader = new RandomMessageReader();
       MessageWriter writer = new GuiWriter();
       
       CommunicationService c = new CommunicationService(reader,writer);
       
        c.copyMessage();
        
       
     
    }
  
}

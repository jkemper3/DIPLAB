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
public class CommunicationService{
    
    
    private MessageReader input;
    private MessageWriter output;

    public CommunicationService(MessageReader input, MessageWriter output) {
        this.input = input;
        this.output = output;
    }
    
   
    
    public void produceMessage() {
        output.sendMessage(input);
    }
} 


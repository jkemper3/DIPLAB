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
    
    
    private MessageReader messageInput;
    private MessageWriter messageOutput;

    public CommunicationService(MessageReader input, MessageWriter output) {
        this.messageInput = input;
        this.messageOutput = output;
    }
    
    public void copyMessage(){
        String message = messageInput.getMessage();
        messageOutput.writeMessage(message);
        
        
    }
}


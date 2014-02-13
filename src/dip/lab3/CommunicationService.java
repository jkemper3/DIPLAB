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
    
    
    private  MessageReader messageReader;
    private  MessageWriter messageWriter;

    public CommunicationService(MessageReader reader, MessageWriter writer) {
        this.messageReader = reader;
        this.messageWriter = writer;
    }
    
    public void copyMessage(){
        messageWriter.writeMessage(messageReader.getMessage());
        
        
    }
}


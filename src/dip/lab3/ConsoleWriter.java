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
public class ConsoleWriter implements MessageWriter{
    private String message;
    
    @Override
    public void writeMessage(MessageReader messageInput) {
          msg = messageInput.getMessage();
        System.out.println(msg.getMessage());
    }
}
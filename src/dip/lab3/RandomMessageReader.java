/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

import java.util.Random;

/**
 *
 * @author jkemper3
 */
public class RandomMessageReader implements MessageReader {
    private String randomMessage [] = {
        "Good Morning",
        "Good Afternoon",
        "Good Night"
    };
    
    public String[] getRandommessage() {
        return randomMessage;
    }

    public final void setRandommessage(String[] Randommessage) {
        this.randomMessage = Randommessage;
    }
      
   @ Override 
    public String getMessage(){
        Random r = new Random(System.nanoTime());
        return randomMessage[r.nextInt(3)];
    }
}

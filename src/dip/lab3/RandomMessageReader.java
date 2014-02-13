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
    private String Randommessage [] = {
        "Good Morning",
        "Good Afternoon",
        "Good Night"
    };
    
    public String[] getRandommessage() {
        return Randommessage;
    }

    public final void setRandommessage(String[] Randommessage) {
        this.Randommessage = Randommessage;
    }
      
   @ Override 
    public String getMessage(){
        Random r = new Random(System.nanoTime());
        return Randommessage[r.nextInt(3)];
    }
}

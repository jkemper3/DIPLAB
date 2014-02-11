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
public class RandomMessage {
    private String messages [] = {
        "Hello World",
        "Java Rocks",
        "Hope I pass"
    };
             
    public String getMessage(){
        Random r = new Random(System.nanoTime());
        return messages[r.nextInt(3)];
    }
}

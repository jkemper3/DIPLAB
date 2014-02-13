/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

import dip.lab1.Employee;

/**
 *
 * @author Justin
 */
public class TipCalculatorService {
 
    private TipCalculator calculator;

    public TipCalculatorService(TipCalculator Calculator) {
        this.calculator = Calculator;
    }
    
    public void getTip(){
        calculator.calculateTip();
    }
}

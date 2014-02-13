package dip.lab1;

import java.text.NumberFormat;


public class Startup {

    public static void main(String[] args) {

        Employee employee1 = new HourlyEmployee(12,1872);
        Employee employee2 = new SalariedEmployee(75000);
         
        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
            nf.format(employee1.getAnnualWages()));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(employee2.getAnnualWages()));
        
    }

}

package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    
    
    public SalariedEmployee(double annualSalary){
        setAnnualSalary(annualSalary);
    }

    public final double getAnnualSalary() {
        if(annualSalary<0||annualSalary>1000000){
            System.out.println("Please enter a valid salary");
        
        }
        return annualSalary;
    }

    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    @ Override
    public final double getAnnualWages() {
        return annualSalary;
    }

    
}

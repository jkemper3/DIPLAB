package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private double bill;
    private double tipAmount;

    
    public FoodServiceTipCalculator(double bill, double tipAmount) {
        this.bill = bill;
        this.tipAmount = tipAmount;
    }
 @Override
    public double calculateTip(){
    return Math.floor((bill*(1+tipAmount))*100) / 100;
    }
 
    public double getBill() {
        return bill;
    }

    public final void setBill(double bill) {
        this.bill = bill;
    }

    public double getTipAmount() {
        return tipAmount;
    }

    public final void setTipAmount(double tipAmount) {
        this.tipAmount = tipAmount;
    }
   


}

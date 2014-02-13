package dip.lab2;


public class BaggageServiceTipCalculator implements TipCalculator {
    private double TipPerBag;
    private int bagCount;

    public BaggageServiceTipCalculator(double TipPerBag, int bagCount) {
        this.TipPerBag = TipPerBag;
        this.bagCount = bagCount;
    }
    
@Override
    public double calculateTip() {
        
        return bagCount + TipPerBag + 1;       
    }

    public double getTipPerBag() {
        return TipPerBag;
    }

    public final void setTipPerBag(double TipPerBag) {
        this.TipPerBag = TipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

    
}

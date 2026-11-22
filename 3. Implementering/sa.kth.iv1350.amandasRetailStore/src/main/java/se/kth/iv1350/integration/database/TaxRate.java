
package se.kth.iv1350.integration.database;

public enum TaxRate {
    LOW(0.06), 
    MEDIUM(0.12),
    HIGH(0.25);
    
    private final double rate;
    
    TaxRate(double rate) {
        this.rate = rate;
    }
    
    public double getRate() {
        return rate;
    }
}

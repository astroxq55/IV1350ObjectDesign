
package se.kth.iv1350.integration.database;

public enum TaxRate {
    LOW(1.06), 
    MEDIUM(1.12),
    HIGH(1.25);
    
    private final double rate;
    
    TaxRate(double rate) {
        this.rate = rate;
    }
    
    public double getRate() {
        return rate;
    }
}

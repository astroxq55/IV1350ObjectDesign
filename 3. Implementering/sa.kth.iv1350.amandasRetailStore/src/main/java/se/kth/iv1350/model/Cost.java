
package se.kth.iv1350.model;

/**
 *
 * @author Amanda Koinberg
 */
class Cost {
    private float saleAmount;
    private float taxAmount;
    private String currency;
    
    
    public Cost() {
        this.saleAmount = 0;
        this.taxAmount = 0;
        this.currency = "SEK";
    }

}

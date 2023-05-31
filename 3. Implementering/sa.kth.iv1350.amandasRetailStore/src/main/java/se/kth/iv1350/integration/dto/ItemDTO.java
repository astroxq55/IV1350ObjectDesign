
package se.kth.iv1350.integration.dto;


public class ItemDTO {
    private int itemID;
    private String name;
    private double price;
    private final double TAX_RATE = 0.2;
    private double taxAmount;
    private double priceWithTax;

    
    /**
     * Constructor for the class ItemDTO
     * @param itemID unique identifying number for an item
     * @param name given string value for given item
     * @param price cost of that item without tax
     */
    public ItemDTO(int itemID, String name, double price){
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.priceWithTax = calculatePriceWithTax(this.price);
    }
    
    private double calculateTaxAmount(double price) {
        return price*TAX_RATE;
    }
    private double calculatePriceWithTax(double price) {
        return price*(1+TAX_RATE);
    }
    
    /**
     * get function for itemID
     * @return value of itemID
     */
    public int getItemID() {
        return itemID;
    }
    
    /**
     * get function for name
     * @return value of name
     */
    public String getName() {
        return name;
    }
    
    /**
     * get function for price, tax excluded
     * @return value of price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * get function for TaxAmount, item price is excluded
     * @return value of TaxAmount
     */
    public double getTaxAmount() {
        return taxAmount;
    }
    
    /**
     * get function for PriceWithTax, full price with tax included
     * @return value of PriceWithTax
     */
    public double getPriceWithTax() {
        return priceWithTax;
    }
    
}

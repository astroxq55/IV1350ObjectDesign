
package se.kth.iv1350.integration.dto;

import se.kth.iv1350.integration.database.TaxRate;

public class ItemDTO {
    private final int itemID;
    private final String name;
    private final String description;
    private final String supplier;
    private final double price;
    private final TaxRate taxRate;
    //private double taxAmount;
    //private double priceWithTax;

    
    /**
     * Constructor for the class ItemDTO
     * @param itemID unique identifying number for an item
     * @param name given string value for given item
     * @param price cost of that item without tax
     */
    public ItemDTO(int itemID, String name, String description, String supplier, double price, TaxRate rate){
        this.itemID = itemID;
        this.name = name;
        this.description = description;
        this.supplier = supplier;
        this.price = price;
        this.taxRate = rate;
        //this.priceWithTax = calculatePriceWithTax(this.price);
    }
    
    //private double calculateTaxAmount(double price) {
    //    return price*taxRate.getRate();
    //}
    //private double calculatePriceWithTax(double price) {
    //    return price*(1 + taxRate.getRate());
    //}
    
    /**
     * get function for itemID
     * @return value of itemID
     */
    public int getItemID() {
        return this.itemID;
    }
    
    /**
     * get function for name
     * @return value of name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * get function for description
     * @return item description
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * get function for supplier
     * @return name of supplier/company
     */
    public String getsupplier() {
        return this.supplier;
    }
    
    /**
     * get function for price, tax excluded
     * @return value of price
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * get function for tax rate
     * @return value of tax rate is LOW, MEDIUM or HIGH
     */
    public double getTaxRate() {
        return this.taxRate.getRate();
    }
    
    /**
     * get function for TaxAmount, item price is excluded
     * @return value of TaxAmount
     */
    //public double getTaxAmount() {
    //    return taxAmount;
    //}
    
    /**
     * get function for PriceWithTax, full price with tax included
     * @return value of PriceWithTax
     */
    //public double getPriceWithTax() {
    //    return priceWithTax;
    //}
    
}


package se.kth.iv1350.integration.dto;

import se.kth.iv1350.integration.database.TaxRate;

public class ItemDTO {
    private final int itemId;
    private final String name;
    private final String description;
    private final String supplier;
    private final double price;
    private final TaxRate taxRate;
    
    /**
     * Constructor for the class ItemDTO
     * @param itemID unique identifying number for an item
     * @param name given string value for given item
     * @param price cost of that item without tax
     */
    public ItemDTO(int itemId, String name, String description, String supplier, double price, TaxRate rate){
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.supplier = supplier;
        this.price = price;
        this.taxRate = rate;
    }
    
    /**
     * get function for itemID
     * @return value of itemID
     */
    public int getItemId() {
        return this.itemId;
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
    
}

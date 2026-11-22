
package se.kth.iv1350.model;

import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.integration.Item;
import se.kth.iv1350.integration.dto.SaleDTO;


public class Sale {
    private List<Item> basket;
    private Cost cost;
    private SaleDTO saleDTO;
    
    /**
     * Constructor that creates a Sale item
     */
    public Sale(int employeeId) {
        this.basket = new ArrayList<>();
        this.cost = new Cost();
        this.saleDTO = new SaleDTO(employeeId);
    }
}


package se.kth.iv1350.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.integration.Item;


public class Sale {
    private LocalDateTime saleTime;
    private int cachierID;
    private List<Item> saleLog = new ArrayList<>();
    private Cost cost;
    private int numberOfArticles = 0;
    
    
    
    /**
     * Constructor that creates a Sale item
     */
    public Sale() {
        this.saleTime = LocalDateTime.now();
    }
}

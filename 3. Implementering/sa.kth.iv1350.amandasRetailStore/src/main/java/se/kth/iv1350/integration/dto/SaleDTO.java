
package se.kth.iv1350.integration.dto;

import java.time.LocalDateTime;


public class SaleDTO {
    private LocalDateTime saleStartTime;
    private LocalDateTime saleEndTime;
    private int cashierID;
    
    /**
     * Constructor that creates a SaleDTO item
     */
    public SaleDTO(int employeeID) {
        this.saleStartTime = LocalDateTime.now();
        this.cashierID = employeeID;
    }
    
    
    
}

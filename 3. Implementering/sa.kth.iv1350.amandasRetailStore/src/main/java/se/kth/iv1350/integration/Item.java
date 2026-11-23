
package se.kth.iv1350.integration;

import se.kth.iv1350.integration.dto.ItemDTO;

public class Item {
    private ItemDTO itemDTO;
    private int quantity;
    
    
    /**
     * Constructor for the class Item
     */
    public Item(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
        this.quantity = 1;
    }
    
    /**
     * Constructor for the class Item with quantity added
     */
    public Item(ItemDTO itemDTO, int quantity) {
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }
    
    /**
     * get function for itemDTO
     * @return <itemDTO> collected information of this item
     */
    public ItemDTO getItemDTO() {
        return itemDTO;
    }
    
    /**
     * get function for quantity
     * @return <quantity> number of items in sale of this type
     */
    public int getQuantity() {
        return quantity;
    }
    
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }
    
}

package se.kth.iv1350.model;

import java.util.Map;
import java.util.LinkedHashMap;
import se.kth.iv1350.integration.Item;
import se.kth.iv1350.integration.dto.SaleDTO;
import se.kth.iv1350.integration.dto.ItemDTO;


public class Sale {
    private final Map<Integer, Item> basket;
    private Cost cost;
    private SaleDTO saleDTO;
    
    /**
     * Constructor that creates a Sale item
     */
    public Sale(int employeeId) {
        this.basket = new LinkedHashMap<>();
        this.cost = new Cost();
        this.saleDTO = new SaleDTO(employeeId);
    }    

    public void addItem(ItemDTO itemDTO, int amount) {
        if(itemExistInBasket(itemDTO)) {
            increaseItemQuantity(itemDTO, amount);
        } else {
           addNewItemsToBasket(itemDTO, amount);
        }
    }
    
    private boolean itemExistInBasket(ItemDTO itemDTO) {
        return (basket.get(itemDTO.getItemId()) != null);
    }
    
    private void increaseItemQuantity(ItemDTO itemDTO, int amount) {
        basket.get(itemDTO).increaseQuantity(amount);
    }
    
    private void addNewItemsToBasket(ItemDTO itemDTO, int quantity) {
        basket.put(itemDTO.getItemId(), new Item(itemDTO, quantity));
    }

}

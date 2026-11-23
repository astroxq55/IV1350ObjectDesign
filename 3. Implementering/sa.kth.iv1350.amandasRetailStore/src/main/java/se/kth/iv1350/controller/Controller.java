
package se.kth.iv1350.controller;

import se.kth.iv1350.integration.DBhandler;
import se.kth.iv1350.model.Sale;
import se.kth.iv1350.integration.Printer;
import se.kth.iv1350.integration.dto.ItemDTO;

public class Controller {
    private DBhandler dbHandler;
    private Sale sale;
    private Printer printer;
    
    // TODO: finish comment
    /**
     * Class Constructor
     * @param dbHandler 
     */
    public Controller(DBhandler dbHandler) {
        this.dbHandler = dbHandler;
        this.printer = new Printer();
    }
    
    /**
     * Creates a Sale object to initiate sale process
     */
    public void initSale() {
        sale = new Sale(getEmployeeIdFromEmployeeDB());
    }
    
    /**
     * Return an employee ID for current cashier performing Sale
     * @return Integer employee ID
     */
    public int getEmployeeIdFromEmployeeDB() {
       return dbHandler.getEmployeeId();
    }
    
    public void processScannedItem(int itemId, int amount) {
        ItemDTO itemDTO = identifyItemInDB(itemId);
        sale.addItem(itemDTO, amount);
    }

    private ItemDTO identifyItemInDB(int itemId) {
        ItemDTO itemDTO = dbHandler.getItemDB().getItem(itemId);
            return itemDTO;
    }
}

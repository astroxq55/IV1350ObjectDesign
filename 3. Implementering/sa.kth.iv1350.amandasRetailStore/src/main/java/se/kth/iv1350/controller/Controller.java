
package se.kth.iv1350.controller;

import se.kth.iv1350.integration.DBhandler;
import se.kth.iv1350.integration.database.ExternalAccounting;
import se.kth.iv1350.integration.database.ExternalInventory;
import se.kth.iv1350.model.Sale;



public class Controller {
    private DBhandler dbHandler;
    private Sale sale;
    
    
    
    
    /**
     * constructor for the class Controller
     */
    public Controller() {
        this.dbHandler = new DBhandler();
        
    }
    
    /**
     * Creates a Sale object to initiate sale process
     */
    public void initSale() {
        sale = new Sale();
    }
    
    
}

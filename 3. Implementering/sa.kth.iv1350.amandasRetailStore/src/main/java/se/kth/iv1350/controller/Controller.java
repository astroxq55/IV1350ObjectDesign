
package se.kth.iv1350.controller;

import se.kth.iv1350.integration.DBhandler;
import se.kth.iv1350.model.Sale;



public class Controller {
    private DBhandler dbHandler;
    private Sale sale;
    
    // TODO: finish comment
    /**
     * Class Constructor
     * @param dbHandler 
     */
    public Controller(DBhandler dbHandler) {
        this.dbHandler = dbHandler;
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
}

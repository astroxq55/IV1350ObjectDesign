
package se.kth.iv1350.integration;

import se.kth.iv1350.integration.database.EmployeeDB;
import se.kth.iv1350.integration.database.ItemDB;
import se.kth.iv1350.integration.dto.ItemDTO;

public class DBhandler {
    private EmployeeDB employeeDB;
    private ItemDB itemDB;
    
    /**
     * Class Constructor
     * @param employeeDB a database containing information of all employees
     * @param itemDB a database containing information of all items the store sells
     */
    public DBhandler(EmployeeDB employeeDB, ItemDB itemDB){
        this.employeeDB = employeeDB;
        this.itemDB = itemDB;
    }
    
    //TODO comment
    public EmployeeDB getEmployeeDB() {
        return this.employeeDB;
    }
    
    //TODO comment
    public ItemDB getItemDB() {
        return this.itemDB;
    }
    
    /**
     * Return an employee ID for current cashier performing Sale
     * @return Integer employee ID
     */
    public Integer getEmployeeId() {
        return employeeDB.getEmployeeId();
    }
    
    /**
     * Get linked employee name from unique employee ID
     * @param employeeId unique ID number of employee
     * @return Cashier Name
     */
    public String getEmployeeName(int employeeId) {
        return employeeDB.getEmployeeName(employeeId);
    } 
    
    /**
     * get function, returns whole ItemDTO stored in itemDB.
     * @param itemId unique identifier for Item
     * @return itemDTO object
     */
    public ItemDTO getItem(int itemId){
        return itemDB.getItem(itemId);
    }
    
}

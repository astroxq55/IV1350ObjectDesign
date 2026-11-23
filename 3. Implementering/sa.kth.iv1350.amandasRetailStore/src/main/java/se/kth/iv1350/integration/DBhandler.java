
package se.kth.iv1350.integration;

import se.kth.iv1350.integration.database.EmployeeDB;
import se.kth.iv1350.integration.database.ItemDB;

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
    
    /**
     * Return an employee ID for current cashier performing Sale
     * @return Integer employee ID
     */
    public Integer getEmployeeId() {
        return employeeDB.getEmployeeId();
    }
    
}

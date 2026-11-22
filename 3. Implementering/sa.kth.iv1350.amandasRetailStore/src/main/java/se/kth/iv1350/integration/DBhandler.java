
package se.kth.iv1350.integration;

import se.kth.iv1350.integration.database.EmployeeDB;

public class DBhandler {
    private EmployeeDB employeeDB;
    
    /**
     * Class Constructor
     * @param employeeDB a database containing information of all employees
     */
    public DBhandler(EmployeeDB employeeDB){
        this.employeeDB = employeeDB;
    }
    
    /**
     * Return an employee ID for current cashier performing Sale
     * @return Integer employee ID
     */
    public Integer getEmployeeId() {
        return employeeDB.getEmployeeId();
    }
    
}

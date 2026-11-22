
package se.kth.iv1350.integration;

import se.kth.iv1350.integration.database.ExternalAccounting;
import se.kth.iv1350.integration.database.ExternalInventory;
import se.kth.iv1350.integration.database.MemberCatalog;
import se.kth.iv1350.integration.database.EmployeeDB;

public class DBhandler {
    private ExternalAccounting storeAccounting;
    private ExternalInventory storeInventory;
    private MemberCatalog memberCatalog;
    private EmployeeDB employeeDB;
    
    
    /**
     * 
     * @param storeAccounting
     * @param storeInventory 
     */
    public DBhandler(){
        this.storeAccounting = new ExternalAccounting();
        this.storeInventory = new ExternalInventory();  
        this.memberCatalog = new MemberCatalog(); 
        this.employeeDB = new EmployeeDB();
    }
    
    public int getEmployeeId() {
        return employeeDB.getEmployeeId();
    }
    
}


package se.kth.iv1350.integration;

import se.kth.iv1350.integration.database.ExternalAccounting;
import se.kth.iv1350.integration.database.ExternalInventory;
import se.kth.iv1350.integration.database.MemberCatalog;


public class DBhandler {
    private ExternalAccounting storeAccounting;
    private ExternalInventory storeInventory;
    private MemberCatalog memberCatalog;
    
    
    /**
     * 
     * @param storeAccounting
     * @param storeInventory 
     */
    public DBhandler(){
        this.storeAccounting = new ExternalAccounting();
        this.storeInventory = new ExternalInventory();  
        this.memberCatalog = new MemberCatalog(); 
    }
    
}

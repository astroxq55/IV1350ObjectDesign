
package se.kth.iv1350.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.integration.database.EmployeeDB;
import se.kth.iv1350.integration.database.ItemDB;
import se.kth.iv1350.integration.dto.ItemDTO;


public class DBhandlerTest {
    
    private static final int KNOWN_EMPLOYEE_ID = 100903; // Cruella DeVille
    private static final int KNOWN_ITEM_ID = 100012; // Lemon
    private static final int UNKNOWN_ITEM_ID = -1;
    
    private DBhandler dbHandler;
    private EmployeeDB employeeDB;
    private ItemDB itemDB;
    
    @BeforeEach
    public void setUp() {
        employeeDB = new EmployeeDB();
        itemDB = new ItemDB();
        dbHandler = new DBhandler(employeeDB, itemDB);
    }
    
    @AfterEach
    public void tearDown() {
        dbHandler = null;
        employeeDB = null;
        itemDB = null;
    }
    
    @Test
    public void getEmployeeId_nullEmployeeDb_throwsNullPointerException() {
        DBhandler handlerWithNull = new DBhandler(null, itemDB);
        assertThrows(NullPointerException.class,
                () -> handlerWithNull.getEmployeeId(),
                "Using a DBhandler created with null should throw NullPointerException.");
    }
    
    @Test
    public void getEmployeeId_validDb_returnsSameIdAsEmployeeDb() {
        int employeeDbId = employeeDB.getEmployeeId();
        int dbHandlerId = dbHandler.getEmployeeId();
        assertEquals(employeeDbId, dbHandlerId, 
                "ID received from dbHandler and directly from EmployeeDB doesn't match.");
    }
    
        @Test
    public void getEmployeeId_validDb_returnsNonNull() {
        assertNotNull(dbHandler.getEmployeeId(), 
                "Method getEmployeeId() returns Null.");
    }
    
    @Test
    public void getEmployeeId_validDb_returnsIdThatHasNameInEmployeeDb() {
        int id = dbHandler.getEmployeeId();
        assertNotNull(employeeDB.getEmployeeName(id),
                "ID returned by dbHandler does not exist in EmployeeDB.");
    }
    
    @Test
    public void getEmployeeId_nullItemDb_stillReturnsId() {
        DBhandler handlerWithNullItemDb = new DBhandler(employeeDB, null);
        assertEquals(employeeDB.getEmployeeId(), handlerWithNullItemDb.getEmployeeId(),
                "getEmployeeId() should work even if ItemDB is null.");
    }
        
    @Test
    public void getItem_knownId_returnsSameItemAsItemDb() {
        ItemDTO itemDtoFromDB = itemDB.getItem(KNOWN_ITEM_ID);
        ItemDTO itemDtoViaDbHandler = dbHandler.getItem(KNOWN_ITEM_ID);
        assertEquals(itemDtoFromDB, itemDtoViaDbHandler, 
                "ItemDTO received via dbHandler and directly from ItemDB is not the same object.");
    }
    
    @Test
    public void getItem_unknownId_returnsNull() {
        assertNull(dbHandler.getItem(UNKNOWN_ITEM_ID), 
                "Unknown Item ID returns an ItemDTO");
    }
    
    @Test
    public void getItem_knownId_returnsNonNull() {
        assertNotNull(dbHandler.getItem(KNOWN_ITEM_ID), 
                "Known ID returns null.");
    }
    
    @Test
    public void getItem_knownId_returnsItemWithRequestedId() {
        ItemDTO item = dbHandler.getItem(KNOWN_ITEM_ID);
        assertNotNull(item, "Known item ID returned null.");
        assertEquals(KNOWN_ITEM_ID, item.getItemId(),
                "Returned item has a different ID than the one requested.");
        
    }
    
    @Test
    public void getItem_nullItemDb_throwsNullPointerException() {
        DBhandler handlerWithNullItemDb = new DBhandler(employeeDB, null);
        assertThrows(NullPointerException.class,
                () -> handlerWithNullItemDb.getItem(KNOWN_ITEM_ID),
                "Using a DBhandler created with null ItemDB should throw NullPointerException.");
    }




    
    
}

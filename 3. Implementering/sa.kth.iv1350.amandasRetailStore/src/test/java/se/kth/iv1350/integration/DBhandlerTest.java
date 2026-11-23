
package se.kth.iv1350.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.integration.database.EmployeeDB;
import se.kth.iv1350.integration.database.ItemDB;

public class DBhandlerTest {
    
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
    }
    
    @Test
    public void testGetEmployeeIdDoesNotReturnNull() {
        assertNotNull(dbHandler.getEmployeeId(), 
                "Method getEmployeeId() returns Null.");
    }
    
    @Test
    public void testEmployeeIdCalledTwiceReturnsSameId() {
        assertEquals(dbHandler.getEmployeeId(), dbHandler.getEmployeeId(), 
                "Get ID Method call twice generated different result.");
    }
    
    @Test
    public void testNullEmployeeDbThrowsNullPointerExceptionWhenUsed() {
        DBhandler handlerWithNull = new DBhandler(null, null);
        assertThrows(NullPointerException.class,
                () -> handlerWithNull.getEmployeeId(),
                "Using a DBhandler created with null should throw NullPointerException.");
    }
    
    @Test
    public void testIdFromEmployeeDbAndDbHandlerMatch() {
        Integer employeeDbId = employeeDB.getEmployeeId();
        Integer dbHandlerId = dbHandler.getEmployeeId();
        assertEquals(employeeDbId, dbHandlerId, 
                "ID received from dbHandler and directly from EmployeeDB separately doesn't match.");
    }
    
    //TODO: write a bunch of tests for ItemDB
    
}

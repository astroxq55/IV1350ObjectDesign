
package se.kth.iv1350.integration.database;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeDBTest {
    
    private EmployeeDB db;
    
    @BeforeEach
    public void setUp() {
        db = new EmployeeDB();
    }
    
    @AfterEach
    public void tearDown() {
        db = null;
    }
    
    @Test
    public void testExistingIdReturnsCorrectName()  {
        assertEquals("Peggy Hill", db.getEmployeeName(104921), "ID 104921 gave wrong name. Expected 'Peggy Hill'");
    }
    
    @Test
    public void testUnknownIdReturnsNull()  {
        assertNull(db.getEmployeeName(999999), "None-existant ID returned a name not equal to Null.");
    }
    
    @Test
    public void testNullIdReturnsNull() {
        assertNull(db.getEmployeeName(null), "Null ID did not return Null.");
    }
    
    @Test 
    public void testReturnedIdHasAName() {
        Integer id = db.getEmployeeId();
        assertNotNull(db.getEmployeeName(id), "ID does not have a name.");
    }
    
    @Test
    public void testNameIsNotEmptyString() {
        Integer id = db.getEmployeeId();
        assertNotEquals("", db.getEmployeeName(id), "Name is empty String.");
    }
    
    @Test
    public void testEmployeeIdCalledTwiceReturnsSameId() {
        assertEquals(db.getEmployeeId(), db.getEmployeeId(), "Get ID Method call twice generated different result.");
    }

    @Test
    public void testConstructorCreatesNonNullMap() {
        assertNotNull(db.employees, "The Database is Null. Did not create employee DB.");
    }
    
    @Test
    public void testConstructorIsFilledWithEmployees() {
        assertFalse(db.employees.isEmpty(), "Database should be filled with employee content.");
    }
    
}

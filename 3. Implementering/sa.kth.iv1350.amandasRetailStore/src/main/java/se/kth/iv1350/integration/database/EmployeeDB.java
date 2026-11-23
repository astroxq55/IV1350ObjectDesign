
package se.kth.iv1350.integration.database;

import java.util.HashMap;

public class EmployeeDB {
    
    HashMap<Integer, String> employees;
    
    /**
     * Class Constructor
     * Creates employee DB HashMap and fills it with hard coded data
     */
    public EmployeeDB() {
        this.employees = new HashMap<>();
        fillDataBaseWithData();
    }  
    
    /**
     * Get the ID number of an employee in the DB
     * @return ID number
     */
    public Integer getEmployeeId() {
        return employees.keySet().iterator().next();
    }
    
    /**
     * Get linked employee name from unique employee ID
     * @param employeeId unique ID number of employee
     * @return Cashier Name
     */
    public String getEmployeeName(int employeeId) {
        return employees.get(employeeId);
    } 
    
    private void fillDataBaseWithData() {
        employees.put(100086, "Boss Lightyear");
        employees.put(100903, "Cruella DeVille");
        employees.put(100927, "Elizabeth II of Britain");
        employees.put(101160, "Leif Lindbäck");
        employees.put(101991, "Homer Simpson");  
        employees.put(104921, "Peggy Hill");
        employees.put(105483, "Peter Pan");
        employees.put(107810, "Whitney Houston");
        employees.put(107540, "Walter White");
    }
 
}

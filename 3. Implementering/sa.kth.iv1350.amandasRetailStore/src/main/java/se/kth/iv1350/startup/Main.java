
package se.kth.iv1350.startup;

import se.kth.iv1350.controller.Controller;
import se.kth.iv1350.view.View;
import se.kth.iv1350.integration.database.EmployeeDB;
import se.kth.iv1350.integration.database.ItemDB;
import se.kth.iv1350.integration.DBhandler;


public class Main {
    
    public static void main(String[] args) {
        
        // Create all Data Bases and DB Handler
        EmployeeDB employeeDB = new EmployeeDB();
        ItemDB itemDB = new ItemDB();
        DBhandler dbHandler = new DBhandler(employeeDB, itemDB);

        // Initiate program
        Controller controller = new Controller(dbHandler);
        View view = new View(controller);
        
        // Run Sale Program
        view.initFakeSampleSale();
    }
}

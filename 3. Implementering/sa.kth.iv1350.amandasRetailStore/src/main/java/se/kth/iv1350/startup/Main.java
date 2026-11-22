
package se.kth.iv1350.startup;

import se.kth.iv1350.controller.Controller;
import se.kth.iv1350.view.View;
import se.kth.iv1350.integration.database.EmployeeDB;


public class Main {
    
    public static void main(String[] args) {
        
        EmployeeDB employeeDB = new EmployeeDB();

        Controller controller = new Controller();
        View view = new View(controller);
        view.initFakeSampleSale();
    }
}

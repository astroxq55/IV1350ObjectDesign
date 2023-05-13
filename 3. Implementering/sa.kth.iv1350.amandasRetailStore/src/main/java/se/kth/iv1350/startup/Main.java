
package se.kth.iv1350.startup;

import se.kth.iv1350.controller.Controller;
import se.kth.iv1350.view.View;


public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        

        Controller controller = new Controller();
        View view = new View(controller);
        view.initiateFakeSampleSale();
        
    }
    
}

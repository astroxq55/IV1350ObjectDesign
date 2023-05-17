
package se.kth.iv1350.view;

import se.kth.iv1350.controller.Controller;

public class View {
    private Controller controller;
    
    /**
     * constructor for the View class
     * @param contr a controller object
     */
    public View(Controller contr) {
        this.controller = contr;
    
    }
    
    /**
     * Runs a fake sample sale so show of the POS program
     */
    public void initFakeSampleSale() {
        
        System.out.println("Initiating sale");
        controller.initSale();
        
        System.out.println("Start scanning items:");
        
        
        System.out.println("Payment time");
        
        
        System.out.println("Finish sale and update DB system");
        
    }
    
}


package se.kth.iv1350.view;

import se.kth.iv1350.controller.Controller;

public class View {
    private Controller controller;
    
    /**
     * 
     * @param contr 
     */
    public View(Controller contr) {
        this.controller = contr;
    
    }
    
    /**
     * 
     */
    public void initiateFakeSampleSale() {
        System.out.println("Startup");
        
        System.out.println("Initiating sale");
        
        System.out.println("Adding items");
        
        System.out.println("Payment time");
        
        System.out.println("Finish sale and update DB system");
        
    }
    
    
}

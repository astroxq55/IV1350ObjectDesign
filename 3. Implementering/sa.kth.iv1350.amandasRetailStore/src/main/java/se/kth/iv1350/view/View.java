
package se.kth.iv1350.view;

import se.kth.iv1350.controller.Controller;

public class View {
    private Controller controller;
    private int currentCashierID;
    
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
        
        System.out.println(">Cashier is Initiating sale");
        controller.initSale();
        
        System.out.println(">Cashier Starts scanning items:");
        scanItems(200001, 1);
        
        System.out.println(">Cashier is collecting Payment");
        
        System.out.println(">Cashier Finish update DB system with saleLog");
        
        System.out.println(">Cashier finished sale.");
        
    }
    
    private void scanItems(int itemId, int amount) {
        controller.processScannedItem(itemId, amount);
    }

    
}

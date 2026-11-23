
package se.kth.iv1350.integration.database;

import se.kth.iv1350.integration.dto.ItemDTO;
import java.util.HashMap;


public class ItemDB {
    
    private final HashMap<Integer, ItemDTO> items = new HashMap<>();
    
    
    /**
     * Class Constructor
     * Creates DB item and fills it with item data content.
     * The database contains information about available articles that the store sells. 
     * The database does not contain any information about available inventory. See StoreInventoryDB.
     */
    public ItemDB() {
        fillDatabaseWithData();
    }
    
    /**
     * get function, returns whole ItemDTO stored in items HashMap.
     * @param itemId unique identifier for Item
     * @return itemDTO object
     */
    public ItemDTO getItem(int itemId) {
        return items.get(itemId);
    } 
    
    private void addItem(ItemDTO item) {
        items.put(item.getItemID(), item);
    }
    
    /**
     * Each items contains the information:
     * (ItemId, Name, Description, Supplier, Price (excluding VAT), Tax Rate)
     */
    private void fillDatabaseWithData() {
        // Fruit and vegetables (100xxx)
        addItem(new ItemDTO(100001, "Cucumber", "Organic", "The Orchard", 10.0, TaxRate.LOW));
        addItem(new ItemDTO(100002, "Banana", "Fairtrade, per kg", "Tropical Fruit Co", 22.0, TaxRate.LOW));
        addItem(new ItemDTO(100003, "Apple", "Swedish, per kg", "The Orchard", 30.0, TaxRate.LOW));
        addItem(new ItemDTO(100004, "Pear", "Conference, per kg", "The Orchard", 35.0, TaxRate.LOW));
        addItem(new ItemDTO(100005, "Tomato", "Vine tomato, per kg", "Greengrocer Wholesale", 40.0, TaxRate.LOW));
        addItem(new ItemDTO(100006, "Carrot", "Swedish, 1 kg", "Greengrocer Wholesale", 15.0, TaxRate.LOW));
        addItem(new ItemDTO(100007, "Potato", "Firm, 2 kg", "Greengrocer Wholesale", 25.0, TaxRate.LOW));
        addItem(new ItemDTO(100008, "Yellow onion", "Swedish, 1 kg", "Greengrocer Wholesale", 14.0, TaxRate.LOW));
        addItem(new ItemDTO(100009, "Bell pepper", "Red, each", "The Orchard", 12.0, TaxRate.LOW));
        addItem(new ItemDTO(100010, "Broccoli", "Head, each", "The Orchard", 20.0, TaxRate.LOW));
        addItem(new ItemDTO(100011, "Orange", "Per kg", "Tropical Fruit Co", 28.0, TaxRate.LOW));
        addItem(new ItemDTO(100012, "Lemon", "Each", "Tropical Fruit Co", 5.0, TaxRate.LOW));

        // Dairy and pantry (200xxx)
        addItem(new ItemDTO(200001, "Milk", "Semi-skimmed 1.5%, 1 l", "Northern Dairy", 16.0, TaxRate.LOW));
        addItem(new ItemDTO(200002, "Soured milk", "Plain, 1 l", "Northern Dairy", 18.0, TaxRate.LOW));
        addItem(new ItemDTO(200003, "Butter", "Lightly salted, 500 g", "Northern Dairy", 55.0, TaxRate.LOW));
        addItem(new ItemDTO(200004, "Cheese", "Aged cheddar, 700 g", "Cheese Makers", 99.0, TaxRate.LOW));
        addItem(new ItemDTO(200005, "Eggs", "Free range, 12-pack", "Farm Fresh Eggs", 38.0, TaxRate.LOW));
        addItem(new ItemDTO(200006, "Yoghurt", "Vanilla, 1 l", "Northern Dairy", 24.0, TaxRate.LOW));
        addItem(new ItemDTO(200007, "Cream", "Whipping cream, 5 dl", "Northern Dairy", 22.0, TaxRate.LOW));
        addItem(new ItemDTO(200008, "Quark", "Plain, 500 g", "Northern Dairy", 25.0, TaxRate.LOW));
        addItem(new ItemDTO(200009, "Bread", "Sliced loaf, 750 g", "Southern Bakery", 32.0, TaxRate.LOW));
        addItem(new ItemDTO(200010, "Crispbread", "Whole grain, 260 g", "Southern Bakery", 20.0, TaxRate.LOW));
        addItem(new ItemDTO(200011, "Muesli", "Fruit and nuts, 750 g", "Breakfast Brands", 42.0, TaxRate.LOW));
        addItem(new ItemDTO(200012, "Pasta", "Penne, 500 g", "Pasta Factory", 18.0, TaxRate.LOW));

        // Hygiene and household (300xxx)
        addItem(new ItemDTO(300001, "Shampoo", "Normal hair, 250 ml", "Hygiene Co", 35.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300002, "Conditioner", "Moisturizing, 250 ml", "Hygiene Co", 38.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300003, "Hand soap", "Liquid, 250 ml", "Hygiene Co", 25.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300004, "Toothpaste", "Mint, 75 ml", "Oral Care Inc", 30.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300005, "Toothbrush", "Medium, 2-pack", "Oral Care Inc", 40.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300006, "Deodorant", "Roll-on, 50 ml", "Hygiene Co", 32.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300007, "Shower gel", "Citrus, 250 ml", "Hygiene Co", 29.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300008, "Toilet paper", "12 rolls", "Paper Mill", 59.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300009, "Paper towels", "4 rolls", "Paper Mill", 45.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300010, "Dish soap", "Lemon, 500 ml", "Clean & Bright", 22.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300011, "Laundry detergent", "Colors, 1.5 l", "Clean & Bright", 65.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(300012, "Hand cream", "Unscented, 100 ml", "Hygiene Co", 36.0, TaxRate.MEDIUM));

        // Drinks and snacks (400xxx)
        addItem(new ItemDTO(400001, "Whiskey", "Single malt, 70 cl", "The Distillery", 399.0, TaxRate.HIGH));
        addItem(new ItemDTO(400002, "Red wine", "Spanish, 75 cl", "Wine Imports", 119.0, TaxRate.HIGH));
        addItem(new ItemDTO(400003, "White wine", "German, 75 cl", "Wine Imports", 109.0, TaxRate.HIGH));
        addItem(new ItemDTO(400004, "Beer", "Lager, 6-pack", "The Brewery", 89.0, TaxRate.HIGH));
        addItem(new ItemDTO(400005, "Cider", "Apple, 33 cl", "The Brewery", 18.0, TaxRate.HIGH));
        addItem(new ItemDTO(400006, "Vodka", "Plain, 70 cl", "The Distillery", 249.0, TaxRate.HIGH));
        addItem(new ItemDTO(400007, "Gin", "London dry, 70 cl", "The Distillery", 289.0, TaxRate.HIGH));
        addItem(new ItemDTO(400008, "Chips", "Sour cream and onion, 175 g", "Snack Co", 32.0, TaxRate.HIGH));
        addItem(new ItemDTO(400009, "Chocolate", "Milk chocolate, 200 g", "Chocolate Factory", 39.0, TaxRate.HIGH));
        addItem(new ItemDTO(400010, "Candy", "Assorted, 400 g", "Chocolate Factory", 45.0, TaxRate.HIGH));
        addItem(new ItemDTO(400011, "Soda", "Cola, 1.5 l", "Beverage Co", 21.0, TaxRate.HIGH));
        addItem(new ItemDTO(400012, "Energy drink", "33 cl", "Beverage Co", 19.0, TaxRate.HIGH));
        addItem(new ItemDTO(400013, "Coffee", "Medium roast, 450 g", "The Roastery", 59.0, TaxRate.HIGH));
        addItem(new ItemDTO(400014, "Tea", "Earl Grey, 20 bags", "The Roastery", 29.0, TaxRate.HIGH));

        // Meat and fish (500xxx)
        addItem(new ItemDTO(500001, "Chicken breast", "Skinless, 500 g", "Farm Meats", 69.0, TaxRate.LOW));
        addItem(new ItemDTO(500002, "Minced beef", "Swedish, 500 g", "Farm Meats", 75.0, TaxRate.LOW));
        addItem(new ItemDTO(500003, "Pork chops", "Bone-in, 600 g", "Farm Meats", 65.0, TaxRate.LOW));
        addItem(new ItemDTO(500004, "Bacon", "Sliced, 140 g", "Farm Meats", 29.0, TaxRate.LOW));
        addItem(new ItemDTO(500005, "Sausage", "Grilling sausage, 400 g", "Farm Meats", 35.0, TaxRate.LOW));
        addItem(new ItemDTO(500006, "Ham", "Sliced, 150 g", "Farm Meats", 27.0, TaxRate.LOW));
        addItem(new ItemDTO(500007, "Salmon fillet", "Fresh, 400 g", "Nordic Seafood", 109.0, TaxRate.LOW));
        addItem(new ItemDTO(500008, "Cod fillet", "Frozen, 400 g", "Nordic Seafood", 79.0, TaxRate.LOW));
        addItem(new ItemDTO(500009, "Shrimp", "Peeled, 200 g", "Nordic Seafood", 59.0, TaxRate.LOW));
        addItem(new ItemDTO(500010, "Smoked mackerel", "Whole, 250 g", "Nordic Seafood", 45.0, TaxRate.LOW));
        addItem(new ItemDTO(500011, "Tuna", "In water, 3-pack", "Nordic Seafood", 39.0, TaxRate.LOW));
        addItem(new ItemDTO(500012, "Meatballs", "Ready to heat, 500 g", "Farm Meats", 49.0, TaxRate.LOW));

        // Baby and pet products (600xxx)
        addItem(new ItemDTO(600001, "Diapers", "Size 4, 40-pack", "Little Ones", 119.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600002, "Baby wipes", "Sensitive, 80-pack", "Little Ones", 29.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600003, "Baby shampoo", "Tear-free, 200 ml", "Little Ones", 39.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600004, "Baby lotion", "Fragrance-free, 200 ml", "Little Ones", 45.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600005, "Pacifier", "Silicone, 2-pack", "Little Ones", 49.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600006, "Baby bottle", "Anti-colic, 260 ml", "Little Ones", 69.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600007, "Dog food", "Adult, dry, 3 kg", "Happy Pets", 139.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600008, "Cat food", "Chicken, 12-pack pouches", "Happy Pets", 89.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600009, "Cat litter", "Clumping, 10 l", "Happy Pets", 99.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600010, "Dog treats", "Dental sticks, 7-pack", "Happy Pets", 45.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600011, "Bird seed", "Wild bird mix, 1 kg", "Happy Pets", 35.0, TaxRate.MEDIUM));
        addItem(new ItemDTO(600012, "Pet shampoo", "Gentle, 250 ml", "Happy Pets", 55.0, TaxRate.MEDIUM));

        // Stationery and electronics (700xxx)
        addItem(new ItemDTO(700001, "Ballpoint pens", "Blue, 10-pack", "Office Supply Co", 29.0, TaxRate.HIGH));
        addItem(new ItemDTO(700002, "Notebook", "A5, lined", "Office Supply Co", 25.0, TaxRate.HIGH));
        addItem(new ItemDTO(700003, "Printer paper", "A4, 500 sheets", "Office Supply Co", 59.0, TaxRate.HIGH));
        addItem(new ItemDTO(700004, "Stapler", "Standard, with staples", "Office Supply Co", 49.0, TaxRate.HIGH));
        addItem(new ItemDTO(700005, "AA batteries", "Alkaline, 8-pack", "Power Plus", 69.0, TaxRate.HIGH));
        addItem(new ItemDTO(700006, "AAA batteries", "Alkaline, 8-pack", "Power Plus", 65.0, TaxRate.HIGH));
        addItem(new ItemDTO(700007, "USB cable", "USB-C, 1 m", "Tech Basics", 79.0, TaxRate.HIGH));
        addItem(new ItemDTO(700008, "Phone charger", "20 W, USB-C", "Tech Basics", 149.0, TaxRate.HIGH));
        addItem(new ItemDTO(700009, "Headphones", "Wired, in-ear", "Tech Basics", 129.0, TaxRate.HIGH));
        addItem(new ItemDTO(700010, "LED light bulb", "E27, warm white", "Bright Ideas", 39.0, TaxRate.HIGH));
        addItem(new ItemDTO(700011, "Extension cord", "3 m, 4 outlets", "Bright Ideas", 99.0, TaxRate.HIGH));
        addItem(new ItemDTO(700012, "Flashlight", "LED, pocket size", "Bright Ideas", 59.0, TaxRate.HIGH));
    }
    
}

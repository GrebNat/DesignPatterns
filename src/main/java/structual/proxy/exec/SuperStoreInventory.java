package structual.proxy.exec;

import java.util.ArrayList;

public class SuperStoreInventory implements Inventory{

    ArrayList<Item> inventory = new ArrayList<>();

    public SuperStoreInventory() {
        inventory.add(new Item("sdf",123,1324));
        inventory.add(new Item("fqwgrh",123543,1324));
        inventory.add(new Item("rth",55,2456));
        inventory.add(new Item("gt",54542,25462));
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}

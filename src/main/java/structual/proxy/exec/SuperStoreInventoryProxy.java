package structual.proxy.exec;

import java.util.ArrayList;

public class SuperStoreInventoryProxy implements Inventory{

    Inventory storeInventory;


    @Override
    public ArrayList<Item> getInventory() {
        if (storeInventory == null)
            storeInventory = new SuperStoreInventory();

        return storeInventory.getInventory();
    }
}

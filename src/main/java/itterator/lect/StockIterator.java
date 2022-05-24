package itterator.lect;

import java.util.Iterator;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class StockIterator implements Iterator {

    private Inventory inventory;
    private int index;

    public StockIterator(Inventory inventory) {
        this.inventory = inventory;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return inventory.getItems().length > index;
    }

    @Override
    public Item next() {
        if (hasNext())
            return inventory.getItems()[index++];

        return null;
    }

    @Override
    public void remove() {

    }
}

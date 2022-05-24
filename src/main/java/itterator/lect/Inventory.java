package itterator.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Inventory implements Iterable{

    private Item[] items;

    public Inventory(Item... items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    @Override
    public StockIterator iterator() {
        return new StockIterator(this);
    }
}

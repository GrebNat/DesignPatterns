package itterator.lect;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Item pens = new Item("pens", 175);
        Item pencils = new Item("pensils", 0);
        Item paper = new Item("paper", 2);

        Inventory inventory = new Inventory(paper, pencils, pens);

        StockIterator stockIterator = inventory.iterator();

        while (stockIterator.hasNext())
            System.out.println(stockIterator.next());
    }
}

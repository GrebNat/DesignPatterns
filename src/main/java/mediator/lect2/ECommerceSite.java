package mediator.lect2;

import java.util.HashMap;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class ECommerceSite {

    private HashMap<String, Integer> stock;

    public ECommerceSite() {
        this.stock = new HashMap<>();

        this.stock.put("pens", 100);
        this.stock.put("pencils", 75);
        this.stock.put("erasers", 50);
    }

    public boolean checkInStock(String item, int quantity) {
        return stock.containsKey(item) && stock.get(item) > quantity;
    }

    public void sell(String item, int quantity) {
        int newQuantity = stock.get(item) - quantity;
        stock.put(item, newQuantity);
    }
}

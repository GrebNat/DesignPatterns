package visitor.lect;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class Milk implements Groceries{
    private double price = 2;

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package behaviour.command.visitor.lect;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public class Bread implements Groceries {

    private double price = 1;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

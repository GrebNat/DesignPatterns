package behaviour.command.visitor.lect;

/*
 * Created by grebena1 on 31.05.2022
 * Description:
 */
public interface Groceries {
    double getPrice();

    void accept(Visitor visitor);
}

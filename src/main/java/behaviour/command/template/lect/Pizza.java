package behaviour.command.template.lect;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public abstract class Pizza {
    public void makeBase(){
        System.out.println("mix flour and ega");
        System.out.println("roll out");
    }

    public void addToppings(){
        System.out.println("add tomato");
        System.out.println("add cheese");
    }

    public void cook(){};

    public void printInstruction(){
        makeBase();
        addToppings();
        cook();
        System.out.println();
    }
}

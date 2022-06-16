package creational.prototype.lect;

public class Person implements Cloneable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //ownestly, it works for me ok without overriding this method
    @Override
    protected Person clone() throws CloneNotSupportedException {
        try {
            return (Person) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw  new AssertionError();
        }
    }
}

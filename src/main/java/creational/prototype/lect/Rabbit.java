package creational.prototype.lect;

public class Rabbit implements Cloneable {

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_RED,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;
    private Person owner;

    public Rabbit() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setOwner(String name){
        this.owner = new Person(name);
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    protected Rabbit clone() throws CloneNotSupportedException {
        try {
            Rabbit rabbit =  (Rabbit) super.clone();
            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

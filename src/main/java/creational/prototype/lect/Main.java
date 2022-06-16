package creational.prototype.lect;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);
        rabbit.setOwner("Sally");
        Rabbit rabbit1 = rabbit.clone();
        System.out.println("age of 1 rabbit "+ rabbit.getAge() + " "+ rabbit.getOwner().getName());
        System.out.println("age of 2 rabbit "+ rabbit1.getAge()+ " "+ rabbit1.getOwner().getName());

        rabbit1.setOwner("Don");
        System.out.println(rabbit.getOwner().getName());
        System.out.println(rabbit1.getOwner().getName());
    }
}

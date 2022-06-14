package structual.flyweight.exec;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PopulationSimulation {

    static ArrayList<Animal> animals = new ArrayList<>();
    static AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {

        Runnable createAnimal = new Runnable() {
            @Override
            public void run() {
                createRandomAnimal();
            }
        };

        Runnable removeAnimal = new Runnable() {
            @Override
            public void run() {
                removeAnimal();
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createAnimal, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeAnimal, 5, 5, TimeUnit.SECONDS);
    }

    public static void createRandomAnimal() {
        Random random = new Random();
        int randInt = random.nextInt(2);
        Animal animal = factory.getAnimalInLocation(randInt, random.nextInt(3), random.nextInt(3));

        //странный пример - получается? тчо созжаем машины с разными движками, но они все удаляются
       // animal.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println("Creating " + animal + ",  type:" + animal.getAnimalType() + ", location:"
                + animal.getLocation()[0] + ", " + animal.getLocation()[1]);

        animals.add(animal);
    }

    private static void removeAnimal(){
        System.out.println("removing "+ animals.get(0));
        animals.remove(0);
    }
}

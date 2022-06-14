package structual.flyweight.exec;

import java.util.HashMap;

public class AnimalFactory {

    HashMap<Integer, Animal> animals = new HashMap<>();

    public Animal getAnimal(int type) {
        if (animals.containsKey(type))
            return animals.get(type);

        Animal animal;
        if (type == 0)
            animal = new Lion();
        else
            animal = new Tiger();

        animals.put(type, animal);
        return animal;
    }

    public Animal getAnimalInLocation(int type, int latitude, int longitude) {
        int key = type^2+ latitude^2+longitude^2;
        if (animals.containsKey(key))
            return animals.get(key);

        Animal animal;
        if (type == 0)
            animal = new Lion();
        else
            animal = new Tiger();

        animal.setLocation(latitude, longitude);
        animals.put(key, animal);
        return animal;
    }
}

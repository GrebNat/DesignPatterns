package creational.factory.lect;

import java.util.ArrayList;

public class Chocolate_milk extends Candy{
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for (int i = 0; i < quantity; i++) {
            Chocolate_milk chocolate = new Chocolate_milk();
            chocolatePackage.add(chocolate);
        }
        System.out.println("Package of " + quantity+ "chocolade was made");
        return chocolatePackage;
    }
}

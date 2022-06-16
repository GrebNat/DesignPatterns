package creational.factory.lect;

import java.util.ArrayList;

public class Chocolate_white extends Candy{
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for (int i = 0; i < quantity; i++) {
            Chocolate_white chocolate = new Chocolate_white();
            chocolatePackage.add(chocolate);
        }
        System.out.println("Package of " + quantity+ "chocolade was made");
        return chocolatePackage;
    }
}

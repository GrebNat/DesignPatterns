package mediator.exec;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

/*
 * Created by grebena1 on 24.05.2022
 * Description:
 */
public class Main {

    public static void main(String[] args) {
//        Plain plain = new Plain("123");
//        new Mediator().takeOff(plain);
//
//        HashMap<t, String> hh = new HashMap<>();
//
//        hh.put(new t(), "sdfghjk");
//
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i);
            if (i==4){
                arr.remove(4);
            }
        }
    }
}

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
       Plain plain = new Plain("123");
       new Mediator().takeOff(plain);
    }
}

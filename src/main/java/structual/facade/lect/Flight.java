package structual.facade.lect;

import java.time.LocalDate;

public class Flight {

    public void bookOutwardJourney(LocalDate start) {
        System.out.println("Flight starts " + start);
    }

    public void bookReturnJourney(LocalDate end) {
        System.out.println("Flight ends " + end);
    }
}

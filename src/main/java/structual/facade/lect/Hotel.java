package structual.facade.lect;

import java.time.LocalDate;

public class Hotel {

    public void book(LocalDate checkIn, LocalDate checkOut) {
        System.out.println("hotel stay " + checkIn + " to " + checkOut);
    }
}

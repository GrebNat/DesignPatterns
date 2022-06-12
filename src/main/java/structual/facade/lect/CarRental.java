package structual.facade.lect;

import java.time.LocalDate;

public class CarRental {
    public void book(LocalDate checkIn, LocalDate checkOut) {
        System.out.println("car rent " + checkIn + " to " + checkOut);
    }
}

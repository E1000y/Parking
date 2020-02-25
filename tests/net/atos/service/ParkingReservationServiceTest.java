package net.atos.service;

import net.atos.business.ParkingPlace;
import net.atos.business.Reservation;
import net.atos.business.TimeSlot;
import net.atos.business.User;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertNotNull;

public class ParkingReservationServiceTest {

    @Test
    public void bookParkingPlace() {

        User user = new User("Jean","Luc");
        LocalDateTime startReservation = LocalDateTime.of(2000, Month.JANUARY,01,12,00,00);
        LocalDateTime endReservation = LocalDateTime.of(2010, Month.JANUARY,01,12,00,00);


        TimeSlot timeSlot= new TimeSlot(startReservation,endReservation);
        ParkingPlace parkingPlace = new ParkingPlace();

        ParkingReservationService parkingReservationService = new ParkingReservationService();
        Reservation resa = parkingReservationService.bookParkingPlace(user, timeSlot, parkingPlace);

        assertNotNull("La réservation doit exister", resa);

    }
}
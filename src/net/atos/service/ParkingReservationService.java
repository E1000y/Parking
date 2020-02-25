package net.atos.service;

import net.atos.business.ParkingPlace;
import net.atos.business.Reservation;
import net.atos.business.TimeSlot;
import net.atos.business.User;

public class ParkingReservationService {

    public Reservation bookParkingPlace(User user, TimeSlot slot, ParkingPlace parkingPlace){


        Reservation resa = new Reservation(,,,);

        return resa;
    }

}

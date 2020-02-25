package net.atos.business;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReservationTest {
    Reservation resa = new Reservation();

    @Test
    public void resaExiste() {
        Reservation resa = new Reservation();
        assertNotNull("La résa doit exister",resa);
    }
}
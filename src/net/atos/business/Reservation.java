package net.atos.business;


public class Reservation
{
    private int id_resa;
    User user;
    TimeSlot timeSlot;
    ParkingPlace parkingplace;

    public Reservation(int id_resa, User user, TimeSlot timeSlot, ParkingPlace parkingplace) {
        this.id_resa = id_resa;
        this.user = user;
        this.timeSlot = timeSlot;
        this.parkingplace = parkingplace;
    }




    public int getId_resa() {
        return id_resa;
    }

    public void setId_resa(int id_resa) {
        this.id_resa = id_resa;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public ParkingPlace getParkingplace() {
        return parkingplace;
    }

    public void setParkingplace(ParkingPlace parkingplace) {
        this.parkingplace = parkingplace;
    }
}

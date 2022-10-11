package car_park_assignment_en19384634;


public class Van extends Vehicle {
    int numSeats;

    public Van(String IDplateNo, String brand, int numSeats) {
        super(IDplateNo, brand);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getType() {
        return "Van\t\t";
    }

}

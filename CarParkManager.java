package car_park_assignment_en19384634;

public interface CarParkManager {
    final int totalVehicleSlots = 20;                 //get constant variable as 20 for total slots
    boolean vehicleEntered(Vehicle vehicle);          
    int vehicleLeft(Vehicle vehicle);
    int getNumEmptySlots();
    int getNumOccupiedSlots();
}


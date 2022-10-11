package car_park_assignment_en19384634;

import java.util.ArrayList;

public class SLIITCarParkManager implements CarParkManager {
    ArrayList<Vehicle> vehicles = new ArrayList<>();    //create array list for store entered objects
    private int occupiedSlots = 0;

    public boolean vehicleEntered(Vehicle vehicle)      //pass entered vehicle object
    {
        int availablSlots = getNumEmptySlots();
        if( availablSlots != 0) {
            vehicles.add(vehicle);                       //add object to array list when enter a vehicle
            occupiedSlots++;
            System.out.println("~~Another " + (availablSlots - 1) + " parkingslots available~~\n");
            return true;
        } else {
            System.out.println("\n~~SLIIT Car Park is Full~~");
            return false;
        }
    }

    public int vehicleLeft(Vehicle vehicle) {

        System.out.println("\n~~Vehicle Leaving -> " + vehicle.getType() + "\t" + vehicle.getVehicleNo());
        vehicles.remove(vehicle);                       //remove object from array list when leave a vehicle 
        occupiedSlots--;
        return getNumEmptySlots();                    //return empty slots when leave a vehicle
    }

    public int getNumEmptySlots() {
        int availablSlots = totalVehicleSlots - occupiedSlots;
        return  availablSlots;                                       //return available slots
    }

    public int getNumOccupiedSlots() {
        return vehicles.size();                               //return occupied slots when enter vehicle by using array size
    }


    public void displayVehicles() {
        int i = 1;
        System.out.println("\n\n\t\t~~Vehicles in Park~~");
        for (Vehicle vehicle : vehicles) {
            System.out.println("\n(" + i + ") " + vehicle.getType() + "\t\t" + vehicle.getVehicleNo());
            vehicle.dateTime.datetime();
            i++;
        }
    }
}
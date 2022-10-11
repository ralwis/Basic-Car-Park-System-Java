package car_park_assignment_en19384634;

public class Demo {
    public static void main(String[] args) {
    	boolean status;
        SLIITCarParkManager parkManager = new SLIITCarParkManager();
        
        
        Car car = new Car("CHA-9935", "Honda", 4 , "Blue");      //create object to entered vehicle name it and enter related data 
        status = parkManager.vehicleEntered(car);
        
        ThreeWheeler threeWheeler = new ThreeWheeler("ABP-2895", "Bajaj", false);
        status = parkManager.vehicleEntered(threeWheeler);
        
        Van van = new Van("BCT 9990", "Nissan", 12);
        status = parkManager.vehicleEntered(van);

        ThreeWheeler threeWheeler1 = new ThreeWheeler("AIF-2971", "TVS", true);
        status = parkManager.vehicleEntered(threeWheeler1);
        
        Car car1 = new Car("CHA-2835", "Nissan", 5, "White");
        status = parkManager.vehicleEntered(car1);
        
        ThreeWheeler threeWheeler2 = new ThreeWheeler("AYN-2682", "Bajaj", true);
        status = parkManager.vehicleEntered(threeWheeler2);
        
        Car car2 = new Car("CAZ-5555", "Nissan", 5, "Black");
        status = parkManager.vehicleEntered(car2);

        System.out.println("\nEmpty Slots \t :\t" + parkManager.getNumEmptySlots());

        System.out.println("Occupied Slots\t :\t " + parkManager.getNumOccupiedSlots());

        parkManager.displayVehicles();                   //display details of available vehicles 

        parkManager.vehicleLeft(car);                    //remove left vehicle object 
        parkManager.vehicleLeft(car1);
        parkManager.vehicleLeft(van);
        parkManager.vehicleLeft(car2);


        
        parkManager.displayVehicles();                   //display available vehicles when leave vehicles 
    }
}

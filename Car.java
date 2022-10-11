package car_park_assignment_en19384634;


public class Car extends Vehicle            //abstract vehicle class to car class 
{
    private int numDoors;                   //create variables to Number of door and color of car
    private String color;

    public Car(String IDplateNo, String brand, int numDoors, String color) {
        super(IDplateNo, brand);           //call abstract class(Vehicle)
        this.numDoors = numDoors;                 //call car class variables
        this.color = color; 
    }

    public int getNumDoors() {
        return numDoors;                          //access to given number of doors
    }

    public String getColor() {                    //access to given car color
        return color;
    }
 
    public void setNumDoors(int numDoors) {       //get value for number of doors
        this.numDoors = numDoors;
    }

    public void setColor(String color) {          //get entered car color
        this.color = color;
    }

    
    public String getType() { 
        return "Car\t\t";
    }


}


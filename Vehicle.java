package car_park_assignment_en19384634;


import java.util.Date;

public abstract class Vehicle {
    protected String IDplateNo;    //create variables to vehicle no, brand, entered time and date
    protected String brand;
    protected DateTime dateTime;

    public Vehicle(String IDplateNo, String brand)    //pass variables to constructor
    {
        this.IDplateNo = IDplateNo;
        this.brand = brand;
        dateTime = new DateTime(new Date());
    }

    public void setVehicleNo(String IDplateNo) {         
        this.IDplateNo = IDplateNo;                       //get entered vehicle number
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getVehicleNo() {                    
        return IDplateNo;                                    //access to given vehicle number
    }

    public String getBrand() {
        return brand;
    }

    public abstract String getType();
}

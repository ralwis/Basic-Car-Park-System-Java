package car_park_assignment_en19384634;


public class ThreeWheeler extends Vehicle {
    boolean isTaxi;

    public ThreeWheeler(String IDplateNo, String brand, boolean isTaxi) {
        super(IDplateNo, brand);
        this.isTaxi = isTaxi;
    }

    public boolean isTaxi() {
        return isTaxi;
    }

    public void setTaxi(boolean taxi) {
        isTaxi = taxi;
    }
    
    public String getType() {
        return "ThreeWheeler"; 
    }

    
}

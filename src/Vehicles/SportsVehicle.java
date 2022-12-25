package Vehicles;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
}

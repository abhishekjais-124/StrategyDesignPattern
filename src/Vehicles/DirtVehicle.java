package Vehicles;

public class DirtVehicle extends Vehicle{

    public DirtVehicle() {
        super(new OffRoadDriveStrategy());
    }
}

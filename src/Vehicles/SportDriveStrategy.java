package Vehicles;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Implementing sports vehicle strategy");
    }
}

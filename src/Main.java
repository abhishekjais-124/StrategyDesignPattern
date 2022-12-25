import Cache.Cache;
import Cache.LFUCache;
import Cache.LRUCache;
import Vehicles.SportsVehicle;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Cache cache = new Cache(new LRUCache());
        cache.doOperation();

        Cache cache1 = new Cache(new LFUCache());
        cache1.doOperation();

        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
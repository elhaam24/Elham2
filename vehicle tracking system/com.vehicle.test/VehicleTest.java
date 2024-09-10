import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();
        car.setSpeed(100.0); 
        System.out.println("Car Speed: " + car.getSpeedMph());
        car.drive(150000); 
        System.out.println("Distance Traveled: " + car.getDistanceKm());
        car.setFuelLevel(80.0f);
        System.out.println("Remaining Fuel: " + car.calculateRemainingFuel(150));

        electricCar.setSpeed(120.0);
        System.out.println("Electric Car Speed: " + electricCar.getSpeedMph());
        electricCar.drive(200000);
        System.out.println("Distance Traveled: " + electricCar.getDistanceKm());
        electricCar.setFuelLevel(50.0f); 
        System.out.println("Remaining Fuel: " + electricCar.calculateRemainingFuel(200));
        electricCar.setBatteryLevel(90.0);
        System.out.println("Remaining Battery Level: " + electricCar.getBatteryLevel());
    }
}
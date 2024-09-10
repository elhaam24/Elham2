public class ElectricCar extends Car {
    private double batteryLevel; 

    public void setBatteryLevel(double battery) {
         batteryLevel = battery;
        
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }
    
    public void drive(int distance) {
        batteryLevel -= (distance / 10000); 
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
    }
}
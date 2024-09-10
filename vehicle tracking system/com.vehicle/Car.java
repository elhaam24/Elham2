public class Car {
    private double speedKph; 
    private float fuelLevel;  
    private int distanceTraveled; 

    public void setSpeed(double speed) {
        speedKph = speed;
        
    }

    public void setFuelLevel(float fuel) {
        if (fuel >= 0.0 && fuel <= 100.0) {
            fuelLevel = fuel;
        }
    }

    public void drive(int distance) {
        distanceTraveled += distance;
    }

    public double getSpeedMph() {
        return speedKph / 1.60934;
    }

    public int getDistanceKm() {
        return distanceTraveled / 1000;
    }
    
    public int calculateRemainingFuel(double distance) {
        double fuelConsumed = (distance / 1000) * 0.5; 
        return (int) Math.max(0, fuelLevel - fuelConsumed);
    }
}
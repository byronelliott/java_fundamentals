package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Airplane {
    private String brand;
    private int passengers;
    private int fuelCapacity;
    private int currentFuelLevel;
    private Engine engine;
    private LandingGear landingGear;
    private Wings wings;

    public Airplane(String brand, int passengers, int fuelCapacity, int currentFuelLevel,
                    Engine engine, LandingGear landingGear, Wings wings) {
        this.brand = brand;
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engine = engine;
        this.landingGear = landingGear;
        this.wings = wings;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String type) {
        this.brand = type;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public LandingGear getLandingGear() {
        return landingGear;
    }

    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type='" + brand + '\'' +
                ", passengers=" + passengers +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engine=" + engine +
                ", landingGear=" + landingGear +
                ", wings=" + wings +
                '}';
    }
}

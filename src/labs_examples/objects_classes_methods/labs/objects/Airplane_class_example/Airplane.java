package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Airplane {
    String type;
    int passengers;
    int fuelCapacity;
    int currentFuelLevel;
    Engine engine;
    LandingGear landingGear;
    Wings wings;

    public Airplane(String type, int passengers, int fuelCapacity, int currentFuelLevel,
                    Engine engine, LandingGear landingGear, Wings wings) {
        this.type = type;
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engine = engine;
        this.landingGear = landingGear;
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type='" + type + '\'' +
                ", passengers=" + passengers +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engine=" + engine +
                ", landingGear=" + landingGear +
                ", wings=" + wings +
                '}';
    }
}

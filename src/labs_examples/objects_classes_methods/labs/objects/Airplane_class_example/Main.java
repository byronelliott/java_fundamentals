package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine("piston engine", 2);
        Wings wings1 = new Wings(112);
        LandingGear landingGear1 = new LandingGear(true);
        Airplane airplane1 = new Airplane("Boeing", 188, 450, 221, engine1, landingGear1, wings1);

        System.out.println("This " + airplane1.type + " has a " + airplane1.engine.type + ", " + airplane1.wings.wingSpan + " wingspan, "
                + "it can carry " + airplane1.passengers + " passengers, and it has a retractable landing gear: " + airplane1.landingGear.retractable);
        System.out.println(airplane1.toString());
        System.out.println();

        Engine engine2 = new Engine("turbo", 1);
        Wings wings2 = new Wings(89);
        LandingGear landingGear2 = new LandingGear(false);
        Airplane airplane2 = new Airplane("Airbus", 12, 120, 89, engine2, landingGear2, wings2);

        System.out.println("This " + airplane2.type + " has a " + airplane2.engine.type + ", " + airplane2.wings.wingSpan + " wingspan, "
                + "it can carry " + airplane2.passengers + " passengers, and it has a retractable landing gear: " + airplane2.landingGear.retractable);
        System.out.println(airplane2.type + ", " + airplane2.passengers + ", " + airplane2.fuelCapacity + ", " + airplane2.currentFuelLevel);
        System.out.println(engine2.toString());
        System.out.println(wings2.toString());
        System.out.println(landingGear2.toString());
    }
}

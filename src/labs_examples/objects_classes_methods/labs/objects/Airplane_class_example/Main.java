package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine("piston engine", 2);
        Wings wings1 = new Wings(112);
        LandingGear landingGear1 = new LandingGear(true);
        Airplane airplane1 = new Airplane("Boeing", 188, 450, 221, engine1, landingGear1, wings1);

        System.out.println("This " + airplane1.getBrand() +" has a " + engine1.getType() + ", " + wings1.getWingSpan() + " wingspan, "
                + "it can carry " + airplane1.getPassengers() + " passengers, and it has a retractable landing gear: " + landingGear1.isRetractable());
        System.out.println(airplane1.toString());
        System.out.println();

        Engine engine2 = new Engine("turbo", 1);
        Wings wings2 = new Wings(89);
        LandingGear landingGear2 = new LandingGear(false);
        Airplane airplane2 = new Airplane("Airbus", 12, 120, 89, engine2, landingGear2, wings2);

       System.out.println("This " + airplane2.getBrand() +" has a " + engine2.getType() + ", " + wings2.getWingSpan() + " wingspan, "
                + "it can carry " + airplane2.getPassengers() + " passengers, and it has a retractable landing gear: " + landingGear2.isRetractable());
        System.out.println(airplane2.getBrand() + ", " + airplane2.getPassengers() + ", " + airplane2.getFuelCapacity() + ", " + airplane2.getCurrentFuelLevel());
        System.out.println(engine2.toString());
        System.out.println(wings2.toString());
        System.out.println(landingGear2.toString());
    }
}

package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine("piston engine", 2);
        Wings wings1 = new Wings(112);
        LandingGear landingGear1 = new LandingGear(true);
        Airplane airplane1 = new Airplane("Boeing", 188, 450, 221, engine1, landingGear1, wings1);

        System.out.println("This " + airplane1.type + " has a " + airplane1.engine.type + ", " + airplane1.wings.wingSpan + " wingspan, "
                + "it can carry " + airplane1.passengers + " passengers, and it has a retractable landing gear: " + airplane1.landingGear.retractable);
    }
}

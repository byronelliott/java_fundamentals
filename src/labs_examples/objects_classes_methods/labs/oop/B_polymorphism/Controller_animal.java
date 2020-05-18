package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Controller_animal {

    public static void main(String[] args) {
        Cat Cosmo = new Cat(true,"Cosmo", "Male", 8.21,true,false,"gentle");
        Dog Taters = new Dog(true,"Taters", "Male", true, false, "Bichon");

        System.out.println(Cosmo.getName() + " is a " + Cosmo.getGender() + " who weighs " + Cosmo.getWeight() + "lbs and is " + Cosmo.getTemperament() +".");
        Cosmo.play();
        Cosmo.sleep();
        Cosmo.setTemperament("playful");
        System.out.println(Cosmo.getName() + " is a " + Cosmo.getGender() + " who weighs " + Cosmo.getWeight() + "lbs and is " + Cosmo.getTemperament() +".");
        Taters.eat();
        Taters.sound();
    }
}

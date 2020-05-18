package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Cat extends Pet implements Animal{
    private boolean litterBoxedTrained;
    private boolean deClawed;
    private String temperament;

    public Cat(boolean livesInside, String name, String gender, double weight, boolean litterBoxedTrained, boolean deClawed, String temperament) {
        super(livesInside, name, gender, weight);
        this.litterBoxedTrained = litterBoxedTrained;
        this.deClawed = deClawed;
        this.temperament = temperament;
    }

    public boolean isLitterBoxedTrained() {
        return litterBoxedTrained;
    }

    public void setLitterBoxedTrained(boolean litterBoxedTrained) {
        this.litterBoxedTrained = litterBoxedTrained;
    }

    public boolean isDeClawed() {
        return deClawed;
    }

    public void setDeClawed(boolean deClawed) {
        this.deClawed = deClawed;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void sleep() {
        System.out.println("A cat sleeps all day");
    }

    @Override
    public void eat() {
        System.out.println("Eating salmon and tuna");
    }

    @Override
    public void play() {
        System.out.println("Love this ball of yarn");
    }
}

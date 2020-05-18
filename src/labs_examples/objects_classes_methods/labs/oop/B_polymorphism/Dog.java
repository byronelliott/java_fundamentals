package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Dog extends Pet implements Animal {
    private boolean isPottyTrained;
    private boolean isLeashTrained;
    private String breed;

    public Dog(boolean livesInside, String name, String gender, boolean isPottyTrained, boolean isLeashTrained, String breed) {
        super(livesInside, name, gender);
        this.isPottyTrained = isPottyTrained;
        this.isLeashTrained = isLeashTrained;
        this.breed = breed;
    }

    public boolean isPottyTrained() {
        return isPottyTrained;
    }

    public void setPottyTrained(boolean pottyTrained) {
        isPottyTrained = pottyTrained;
    }

    public boolean isLeashTrained() {
        return isLeashTrained;
    }

    public void setLeashTrained(boolean leashTrained) {
        isLeashTrained = leashTrained;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep at night on your bed");
    }

    @Override
    public void eat() {
        System.out.println("Snarfs down food, fast");
    }

    @Override
    public void play() {
        System.out.println("I love playing fetch");
    }
}

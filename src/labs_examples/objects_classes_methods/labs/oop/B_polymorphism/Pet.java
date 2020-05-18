package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Pet {
    private boolean livesInside;
    private String name;
    private String gender;
    private double weight;

    public Pet(boolean livesInside, String name) {
        this.livesInside = livesInside;
        this.name = name;
    }

    public Pet(boolean livesInside, String name, String gender) {
        this.livesInside = livesInside;
        this.name = name;
        this.gender = gender;
    }

    public Pet(boolean livesInside, String name, String gender, double weight) {
        this.livesInside = livesInside;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public boolean isLivesInside() {
        return livesInside;
    }

    public void setLivesInside(boolean livesInside) {
        this.livesInside = livesInside;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

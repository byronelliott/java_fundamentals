package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Engine {
    private String type;
    private int numberOfEngines;

    public Engine(String type, int numberOfEngines) {
        this.type = type;
        this.numberOfEngines = numberOfEngines;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", numberOfEngines=" + numberOfEngines +
                '}';
    }
}

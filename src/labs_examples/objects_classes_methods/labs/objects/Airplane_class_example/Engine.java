package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Engine {
    String type;
    int numberOfEngines;

    public Engine(String type, int numberOfEngines) {
        this.type = type;
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

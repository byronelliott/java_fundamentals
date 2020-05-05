package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class Wings {
    private int wingSpan;

    public Wings(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "wingSpan=" + wingSpan +
                '}';
    }
}

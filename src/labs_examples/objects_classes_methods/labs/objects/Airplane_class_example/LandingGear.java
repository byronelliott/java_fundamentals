package labs_examples.objects_classes_methods.labs.objects.Airplane_class_example;

public class LandingGear {
    private boolean retractable;

    public LandingGear(boolean retractable) {
        this.retractable = retractable;
    }

    public boolean isRetractable() {
        return retractable;
    }

    public void setRetractable(boolean retractable) {
        this.retractable = retractable;
    }

    @Override
    public String toString() {
        return "LandingGear{" +
                "retractable=" + retractable +
                '}';
    }
}

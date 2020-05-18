package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Bakery extends Employee {
    private String bakingExperience;
    private boolean cakeDecorator;

    public Bakery(String storeName, int sqFt, String name, int idNumber, int hourlyPay, int numberEmployee,
                  String jobTitle, String bakingExperience, boolean cakeDecorator) {
        super(storeName, sqFt, name, idNumber, hourlyPay, numberEmployee, jobTitle);
        this.bakingExperience = bakingExperience;
        this.cakeDecorator = cakeDecorator;
    }

    @Override
    public void delivery() {
        System.out.println("Bakery goods all packaged for delivery!" + "\n");
    }

    @Override
    public void clockIn() {
        System.out.println("Bakery Team Member has clocked in!");
    }
    @Override
    public void breakTime(){
        System.out.println("Bakery Team Member is on break");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Bakery{" +
                "bakingExperience='" + bakingExperience + '\'' +
                ", cakeDecorator=" + cakeDecorator +
                '}';
    }
}

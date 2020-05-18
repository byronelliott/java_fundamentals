package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Produce extends Employee{
    private boolean organicFoodSafety;

    public Produce(String storeName, int sqFt, String name, int idNumber, int hourlyPay, int numberEmployee,
                   String jobTitle, boolean organicFoodSafety) {
        super(storeName, sqFt, name, idNumber, hourlyPay, numberEmployee, jobTitle);
        this.organicFoodSafety = organicFoodSafety;
    }
    @Override
    public void delivery() {
        System.out.println("Produce items ready for delivery!" + "\n");
    }
    @Override
    public void clockIn() {
        System.out.println("Produce Team Member has clocked in!");
    }
    @Override
    public void breakTime(){
        System.out.println("Produce Team Member is on break");
    }
}

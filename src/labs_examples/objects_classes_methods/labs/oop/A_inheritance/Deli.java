package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Deli extends Employee{
    private boolean cheeseKnowledge;

    public Deli(String storeName, int sqFt, String name, int idNumber, int hourlyPay, int numberEmployee,
               String jobTitle, boolean cheeseKnowledge) {
        super(storeName, sqFt, name, idNumber, hourlyPay, numberEmployee, jobTitle);
        this.cheeseKnowledge = cheeseKnowledge;
    }

    @Override
    public void delivery() {
        System.out.println("Deli goods all packaged for delivery!" + "\n");
    }

    @Override
    public void clockIn() {
        System.out.println("Deli Team Member has clocked in!");
    }
    @Override
    public void breakTime(){
        System.out.println("Deli Team Member is on break");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Deli{" +
                "cheeseKnowledge=" + cheeseKnowledge +
                '}';
    }
}

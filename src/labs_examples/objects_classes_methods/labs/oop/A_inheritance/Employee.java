package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Employee extends GroceryStore{
    private String name;
    private int idNumber;
    private int hourlyPay;
    private int numberEmployee;
    private String jobTitle;

    public Employee(String storeName, int sqFt, String name, int idNumber, int hourlyPay, int numberEmployee, String jobTitle) {
        super(storeName, sqFt);
        this.name = name;
        this.idNumber = idNumber;
        this.hourlyPay = hourlyPay;
        this.numberEmployee = numberEmployee;
        this.jobTitle = jobTitle;
    }

    public Employee(String storeName, int sqFt, boolean floralDept, boolean pharmacy, String name, int idNumber, int hourlyPay, int numberEmployee, String jobTitle) {
        super(storeName, sqFt, floralDept, pharmacy);
        this.name = name;
        this.idNumber = idNumber;
        this.hourlyPay = hourlyPay;
        this.numberEmployee = numberEmployee;
        this.jobTitle = jobTitle;
    }
    public void clockIn(){
        System.out.println("Manager has clocked in");
    }
    public void breakTime(){
        System.out.println("Manager is on break");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", hourlyPay=" + hourlyPay +
                ", numberEmployee=" + numberEmployee +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

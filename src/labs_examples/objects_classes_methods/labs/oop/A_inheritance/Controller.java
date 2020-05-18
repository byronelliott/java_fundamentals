package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Controller {

    public static void main(String[] args) {
        GroceryStore store1 = new GroceryStore("Belmar",28000,true,false);
        Bakery bakery1 = new Bakery("Belmar", 28000, "Byron", 4568, 17, 12,"Bakery Lead", "Yes", false);
        Deli deli1 = new Deli("Belmar",28000,"James",6745,22,8,"Cheese Slicer",true);
        Produce produce1 = new Produce("Belmar",28000,"Elliott", 8769,32,14,"Produce Team Lead",true);

        System.out.println(produce1.toString());
        produce1.breakTime();
        produce1.clockIn();
        produce1.delivery();

        System.out.println(bakery1.toString());
        bakery1.breakTime();
        bakery1.clockIn();
        bakery1.delivery();

        System.out.println(deli1.toString());
        deli1.breakTime();
        deli1.clockIn();
        deli1.delivery();


    }
}

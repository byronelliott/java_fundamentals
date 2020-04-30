package labs_examples.objects_classes_methods.labs.objects.Exercise_03_assignment;

public class Person {
    String first;
    String middle;
    String last;
    int age;
    boolean married;

    public Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    public Person(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    public Person(String last, boolean married){
        this.last = last;
        this.married = married;
    }
}

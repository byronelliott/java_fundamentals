package labs_examples.objects_classes_methods.labs.objects.Exercise_02_assignment;

class Controller {

    public static void main(String[] args) {
       Student student = new Student("Byron", 16);
       School school = new School("Wasson", "High School");
        System.out.println(student.name + " is a student at " + school.name + " " + school.type);
    }
}

package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * The parent class A was called first in the creation of the new object which B extends to, so it called upon the int i
 * in class A
 *
 */
class A {

    int i = 10;
}

class B extends A{

    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}
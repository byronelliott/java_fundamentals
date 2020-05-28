package labs_examples.static_nonstatic.labs;

class SuperClassy {

    public static void printThis(){
        System.out.println("A static method calling a static method in another class");
    }
    public void anotherString(){
        System.out.println("A static method calling a non-static method in another class");
    }
    public void aLittleDiddy(){
        anotherString();
        Classy classless = new Classy();
        classless.addition(4,8);
        printThis();
        Classy.multiply(5,6);
    }
}

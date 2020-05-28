package labs_examples.static_nonstatic.labs;

class Classy {

    public static int multiply(int a, int b){
        return divide(45,9) + a*b;
    }
    public static int divide(int x, int y){
        return multiply(6,5) + x/y;
    }
    public int addition(int j, int k){
        return j + k;
    }
    public static void addStatic(){
        Classy lassie = new Classy();
        System.out.println(lassie.addition(8,9));
        SuperClassy.printThis();
        SuperClassy classy = new SuperClassy();
        classy.anotherString();
    }
}

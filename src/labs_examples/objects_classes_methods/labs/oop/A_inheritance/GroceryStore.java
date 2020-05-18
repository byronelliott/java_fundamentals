package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class GroceryStore {
    private String storeName;
    private int sqFt;
    private boolean floralDept;
    private boolean pharmacy;



    public GroceryStore(){
    }
    public GroceryStore(String storeName, int sqFt) {
        this.storeName = storeName;
        this.sqFt = sqFt;
    }
    public GroceryStore(boolean floralDept, boolean pharmacy) {
        this.floralDept = floralDept;
        this.pharmacy = pharmacy;
    }
    public GroceryStore(String storeName, int sqFt, boolean floralDept, boolean pharmacy) {
        this.storeName = storeName;
        this.sqFt = sqFt;
        this.floralDept = floralDept;
        this.pharmacy = pharmacy;
    }
    public void delivery(){
        System.out.println("Groceries delivered!");
    }

    @Override
    public String toString() {
        return "GroceryStore{" +
                "storeName='" + storeName + '\'' +
                ", sqFt=" + sqFt +
                ", floralDept=" + floralDept +
                ", pharmacy=" + pharmacy +
                '}';
    }
}

package java2.inheritance.multilevel;

public class C extends B {
    void displayC() {
        System.out.println("Display C");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}

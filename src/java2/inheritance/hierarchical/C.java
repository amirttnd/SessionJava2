package java2.inheritance.hierarchical;

public class C extends A {
    void displayC() {
        System.out.println("Display C");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayC();
    }
}

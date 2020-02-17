package java2.inheritance.superKeyword;

public class C extends B {
    C(){
        super("Hello");
    }
    void displayC() {
        System.out.println("Display C");
    }

    public static void main(String[] args) {
        C obj = new C();
    }
}

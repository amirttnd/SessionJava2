package java2.inheritance.single;

public class B extends A {

    public static void main(String[] args) {
        B child = new B();
        child.display();

        A a = new B();
        a.display();
    }
}

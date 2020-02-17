package java2.inheritance.superKeyword;

class B extends A {

    B() {
        System.out.println("Default constructor B");
    }

    B(String msg) {
        super(msg);
        System.out.println("Parameter constructor of B " + msg);
    }

    void displayB() {
        System.out.println("Display B");
    }
}

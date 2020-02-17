package java2.inheritance.hierarchical;

class B extends A {
    void displayB() {
        System.out.println("Display B");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.displayA();
        obj.displayB();
    }
}

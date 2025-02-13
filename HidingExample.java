public class HidingExample {
    static class A {
        static void show() {
            System.out.println("Static method in class A");
        }
    }

    static class B extends A {
        static void show() { // This hides A's static method, it does NOT override it
            System.out.println("Static method in class B");
        }
    }

    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        A objBAsA = new B(); // Reference of type A, instance of B

        // Calling hidden static methods not supported.  it works to show results.
        objA.show();    // Calls A's show() → "Static method in class A"
        objB.show();    // Calls B's show() → "Static method in class B"
        objBAsA.show(); // Calls A's show() (Static methods are determined by reference type)

        A.show();
        B.show(); //these work to show class but BasA will not work
       // BAsA.show();
    }
}

 class OverridingExample {
    static class A {
        void show() {
            System.out.println("This is class A");
        }
    }

    static class B extends A {
        void show() {
            System.out.println("This is class B, overriding A");
        }
    }

    public static void main(String[] args) {
        A objA = new A();      // Instance of A
        B objB = new B();      // Instance of B
        A objBAsA = new B();   // Reference type A, but instance of B

        // Calling overridden method
        objA.show();    // Calls A's show() → "This is class A"
        objB.show();    // Calls B's show() → "This is class B, overriding A"
        objBAsA.show(); // Calls B's show() (Dynamic Binding) → "This is class B, overriding A"
    }
}


public class ShadowingExample {
    static class A {
        int x = 10; // Instance variable in superclass
    }

    static class B extends A {
        int x = 20; // Shadows A's variable
    }

    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        A objBAsA = new B(); // Reference of type A, instance of B

        // Accessing variables
        System.out.println("objA.x = " + objA.x); // 10
        System.out.println("objB.x = " + objB.x); // 20
        System.out.println("objBAsA.x = " + objBAsA.x); // 10 (Shadowing applies!)
    }
}

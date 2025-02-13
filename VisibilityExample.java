public class VisibilityExample {
    static class A {
        private void privateMethod() {
            System.out.println("Private method in A (Not accessible outside A)");
        }

        protected void protectedMethod() {
            System.out.println("Protected method in A (Accessible in subclasses)");
        }

        public void publicMethod() {
            System.out.println("Public method in A (Accessible anywhere)");
        }
    }

    static class B extends A {
        protected void protectedMethod() {
            System.out.println("Overridden protected method in B");
        }
    }

    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.publicMethod();
        objB.publicMethod();
        objA.protectedMethod();
        objB.protectedMethod();
        objA.privateMethod();
        //objB.privateMethod(); // ERROR: privateMethod() has private access in A
    }
}

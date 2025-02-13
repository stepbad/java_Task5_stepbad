# Java Overriding and Hiding Rules - Exercise 3 Answers

---

## (a) Can an instance method override a static method?
No, an instance method cannot override a static method.

Static methods belong to the class, while instance methods belong to objects.  
If a subclass defines an instance method with the same name as a static method in the superclass, it is not overriding—it is just a separate method.

### Example:
class A {
    static void staticMethod() { System.out.println("Static in A"); }
}
class B extends A {
    void staticMethod() { System.out.println("Instance method in B"); } // Not overriding
}
This compiles, but staticMethod() in B does not override A's method.

## (b) Can a static method override (hide) an instance method?
No, a static method cannot override an instance method.

If a subclass defines a static method with the same name as an instance method in the superclass, it is not overriding—it is hiding the method.

### Example:
class A {
    void instanceMethod() { System.out.println("Instance method in A"); }
}
class B extends A {
    static void instanceMethod() { System.out.println("Static method in B"); } // Hides, not overrides
}
This compiles, but instanceMethod() in B is a new static method, not an override.


## (c) Can you override a final instance method?
No, you cannot override a final method.

A final method cannot be changed in any subclass.

### Example:
class A {
    final void finalMethod() { System.out.println("Final method in A"); }
}
class B extends A {
    // ERROR: Cannot override finalMethod()
    // void finalMethod() { System.out.println("Overriding A's method"); }
}
Java does not allow this and will produce a compiler error.

## (d) Can you override an instance method and make it final?
=====================================================================
Yes, you can override a method and make it final in the subclass.

The overridden method cannot be further overridden after this.
### Example:

class A {
    void someMethod() { System.out.println("Method in A"); }
}
class B extends A {
    final void someMethod() { System.out.println("Final method in B"); }
}
This is valid, but subclasses of B cannot override someMethod() anymore.

## (e) Can you override an instance method and change its return type?
=========================================================================
Yes, but only if the new return type is a subclass of the original return type (Covariant Return Type).

This is called covariant return types.
### Example:

class Parent {
    Number getValue() { return 10; }
}
class Child extends Parent {
    Integer getValue() { return 20; }
}
This is valid because Integer is a subclass of Number.
However, if the return type is completely different, it is not allowed.

class Parent {
    Number getValue() { return 10; }
}
class Child extends Parent {
    String getValue() { return "Hello"; } // ERROR! String is not a subclass of Number
}
This will cause a compile-time error.

## (f) Can you hide a final static method?
==============================================
Yes, you can hide a final static method.

Since static methods belong to the class (not objects), they do not get overridden, only hidden.
Example:

class A {
    static final void staticMethod() { System.out.println("Static method in A"); }
}
class B extends A {
    static void staticMethod() { System.out.println("Static method in B"); }
}
This compiles, but B's method does not override A's method—it hides it.

## (g) Can an instance field hide a static field?
=======================================================
Yes, an instance field can hide a static field in a subclass.

This is not recommended, but it is allowed.
### Example::

class A {
    static int x = 10;
}
class B extends A {
    int x = 20; // Hides A's static field
}

B objB = new B();
System.out.println(objB.x);  // 20 (Instance field in B)
System.out.println(A.x);     // 10 (Static field in A)
Java treats B.x and A.x as separate variables.

## (h) Can a static field hide an instance field?
====================================================
Yes, a static field can hide an instance field in a subclass.

### Example:

class A {
    int x = 10;
}
class B extends A {
    static int x = 20; // Hides A's instance field
}
Accessing B.x refers to the static field in B, not the instance field in A.

## (i) Can an instance method with public visibility override an instance method with default visibility?
===========================================================================================================
Yes, a public method can override a default method.

Java allows increasing visibility when overriding.
### Example:

class A {
    void defaultMethod() { System.out.println("Default method in A"); }
}
class B extends A {
    public void defaultMethod() { System.out.println("Public method in B"); }
}
This is valid because public expands access.

## (j) Can an instance method with default visibility override an instance method with public visibility?
==========================================================================================================
No, a default method cannot override a public method.

You cannot reduce visibility when overriding.
### Example:

class A {
    public void publicMethod() { System.out.println("Public method in A"); }
}
class B extends A {
    void publicMethod() { System.out.println("Default method in B"); }
}
This won’t compile because the overridden method has reduced visibility.

## (k) Can an instance method with protected visibility override an instance method with default visibility?
=============================================================================================================
Yes, a protected method can override a default method.

This is valid because protected expands visibility.
### Example:

class A {
    void defaultMethod() { System.out.println("Default method in A"); }
}
class B extends A {
    protected void defaultMethod() { System.out.println("Protected method in B"); }
}

## (l) Can an instance method with default visibility override an instance method with protected visibility?
============================================================================================================
No, a default method cannot override a protected method.

This would reduce visibility, which is not allowed.

## (m) Order Access Visibility (Widest to Narrowest)
====================================================
Public → Protected → Default → Private
Rule for Overriding: You can increase or keep visibility the same, but not reduce it.
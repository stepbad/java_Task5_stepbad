public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println(getName() + " the dog barks Woof!");
    }

    public void greets(Dog another) {
        System.out.println(getName() + " the dog barks Woooof! at " + another.getName());
    }

    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}

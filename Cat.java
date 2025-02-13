public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println(getName() + " the cat meows");
    }

    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}

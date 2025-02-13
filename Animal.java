public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Rooooooaaaaaaaar!!!!!!");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Animal: " + name;
    }
}

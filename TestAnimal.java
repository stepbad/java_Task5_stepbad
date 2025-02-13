public class TestAnimal {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Creature");

        genericAnimal.makeSound();

        System.out.println(genericAnimal);

    }
}
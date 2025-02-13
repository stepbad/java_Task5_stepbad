public class TestAnimal {
    public static void main(String[] args) {
        /*
        Animal genericAnimal = new Animal("Creature");
        System.out.println(genericAnimal);

        Mammal genericMammal = new Mammal("Mammal");
        System.out.println(genericMammal);

        Cat myCat = new Cat("Whiskers");
        System.out.println(myCat);

        myCat.greets();
                */


        Dog myDog = new Dog("Rover");
        System.out.println(myDog);
        myDog.greets(); 

        Dog anotherDog = new Dog("Rex");
        myDog.greets(anotherDog);
    }
}


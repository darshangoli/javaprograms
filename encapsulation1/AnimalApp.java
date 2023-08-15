package encapsulation1;

public class AnimalApp {
    public static void main(String args[]){
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

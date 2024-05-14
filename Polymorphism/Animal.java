package Polymorphism;

public class Animal {                  /*example 2 */
    void animalSounds(){
        System.out.println("Animal Sounds: ");
    }
}
class Dog extends Animal{
    void animalSounds(){
        String dog="Bow Bow";
        System.out.println("Dog: "+dog);
    }
}
class Cat extends Animal{
    void animalSounds(){
        String cat="Meoww Meoww";
        System.out.println("Cat: "+cat);
    }
}
class Original{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.animalSounds();
        Animal b=new Dog();
        b.animalSounds();
        Animal c=new Cat();
        c.animalSounds();
    }
}
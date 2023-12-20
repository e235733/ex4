import jp.ac.uryukyu.ie.e235733.Animal;
import jp.ac.uryukyu.ie.e235733.Cat;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("動物");

        System.out.println(animal.getName());
        animal.makeSound();

        Animal cat = new Cat("タマ");

        System.out.println(cat.getName());
        cat.makeSound();
    }
}

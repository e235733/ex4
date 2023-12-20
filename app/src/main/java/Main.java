import jp.ac.uryukyu.ie.e235733.Animal;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("動物");

        System.out.println(animal.getName());
        animal.makeSound();
    }
}

package jp.ac.uryukyu.ie.e235733;

public class Animal {
    String name;

    public Animal(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }

    public void makeSound(){
        System.out.println(this.name + "が鳴いている");
    }
}

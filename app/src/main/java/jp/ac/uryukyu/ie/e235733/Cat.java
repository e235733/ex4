package jp.ac.uryukyu.ie.e235733;

public class Cat extends Animal{
    public Cat(String _name){
        super(_name);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + "がにゃーと鳴いた");
    }
}

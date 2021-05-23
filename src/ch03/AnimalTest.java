package ch03;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Human();
        animal.make();
        Human human = (Human)animal;
        human.think();
    }
}

class Animal{
    
    public void make(){
        System.out.println("움직임");
    }
    
}

class Human extends Animal{
    @Override
    public void make() {
        System.out.println("두뇌");
    }
    public void think(){
        System.out.println("생각");
    }
}

class Lion extends Animal{
    @Override
    public void make() {
        System.out.println("이빨");
    }
}

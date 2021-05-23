package ch03;

public class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("desktop");
    }

    @Override
    public void typing() {
        System.out.println("desktop");
    }

    @Override
    public void turnOff(){
        System.out.println("desktop turn off");
    }

}

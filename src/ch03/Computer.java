package ch03;

public abstract class Computer {

    public abstract void display();//하위클래스에게 책임을 위임
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다");
    }

    public void turnOff(){
        System.out.println("전월을 끕니다");
    }

}

package ch03;
//템플릿 메서드 패턴
public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    
    public void startCar(){
        System.out.println("시동을켭니다.");
    }
    
    public void turnOff(){
        System.out.println("시동을끕니다.");
    }
    public void washCar(){}

    public final void run(){
        startCar();
        drive();
        stop();
        turnOff();
        washCar();//hook메서드
    }//이 순서는 변하면 안되기때문에 상속받는 클래스에서 재정의를 못하게한다
}

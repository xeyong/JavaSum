package ch03;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다");
    }

    @Override
    public void stop() {
        System.out.println("사람이 운전을 멈춥니다");
    }
}

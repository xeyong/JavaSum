package ch03;

public class AiCar extends Car{
    @Override
    public void drive() {
        System.out.println("자율 주행을 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자율 주행을 멈춥니다.");
    }

    @Override
    public void washCar() {
        System.out.println("hook 메서드인 차세차");
    }
}

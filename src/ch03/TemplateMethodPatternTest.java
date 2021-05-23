package ch03;

public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        Car test = new AiCar();
        test.run();//AiCar에서는 hook메서드를 구현했음
        test = new ManualCar();
        test.run();
        //상위 클래스 Car에서 정해둔 run()의 시나리오 를 정의하고 하위클래스에서 drive() stop()을 재정의하도록한다.
    }
}

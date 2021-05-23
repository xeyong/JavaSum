package demonstration.playerTest;

public class Super extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("높이점프합니다!");
    }

    @Override
    public void turn() {
        System.out.println("여러번돕니다!");
    }

    @Override
    public void message() {
        System.out.println("-------------------------");
    }
}

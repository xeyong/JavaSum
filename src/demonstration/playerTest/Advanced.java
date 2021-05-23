package demonstration.playerTest;

public class Advanced extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("점프합니다!");
    }

    @Override
    public void turn() {
        System.out.println("돕니다!");
    }

    @Override
    public void message() {
        System.out.println("-------------------------");
    }
}

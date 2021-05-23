package demonstration.playerTest;

public class Beginner extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("느리게 달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("낮게 점프합니다!");
    }

    @Override
    public void turn() {
        System.out.println("천천히 돕니다!");
    }

    @Override
    public void message() {
        System.out.println("-------------------------");
    }
}

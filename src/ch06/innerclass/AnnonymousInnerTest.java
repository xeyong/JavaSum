package ch06.innerclass;

class Outer2{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){//클래스를 thread화 할때 필요한인터페이스

        int num = 10;

        /*
        class MyRunnable implements Runnable{
            int localNum = 1000;
            @Override
            public void run() {
                //num = 200;   //에러 남. 지역변수는 상수로 바뀜
                //i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");


            }
        }

        return new MyRunnable();
        
         *///사실상 지역내부클래스는 이름이 필요가없다 왜냐하면 사용을 메서드 내부에서만 하기때문에 그래서 익명클래스로 만들어준다
        return new Runnable(){
            int localNum = 1000;
            @Override
            public void run() {
                //num = 200;   //에러 남. 지역변수는 상수로 바뀜
                //i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");


            }
        };//이렇게 클래스이름을 빼고 인터페이스의 메서드를 구현한 형태의 익명클래스로 만들어준다
    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };

}

public class AnnonymousInnerTest {
    public static void main(String[] args) {
            Outer2 out = new Outer2();
            Runnable runnable = out.getRunnable(100);
            runnable.run();
            out.runnable.run();
    }
}

package ch06.thread;

class MyThread extends Thread{
    @Override
    public void run() {
        int i;
        for(i = 1; i<200; i++){
            System.out.print(i+"\t");
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        int i;
        for(i = 1; i<200; i++){
            System.out.print(i+"\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread()+"start");
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        System.out.println(Thread.currentThread()+"end");

        MyThread2 my21 = new MyThread2();
        Thread th1 = new Thread(my21);
        th1.start();
        Thread th2 = new Thread(my21);
        th2.start();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("이것도 하나의 쓰레드입니다 익명클래스를 활용한");
            }
        };
        run.run();
        
        Thread test = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("잘 사용되는 스레드 방법");
            }
        });
        test.start();
    }
}

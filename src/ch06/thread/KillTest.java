package ch06.thread;

import java.io.IOException;

public class KillTest extends Thread{

    private boolean flag;

    public KillTest(String name){
        super(name);
    }


    @Override
    public void run(){
        while(!flag){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName()+"end");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        KillTest th1 = new KillTest("A");//쓰레드파라미터로 String넣으면 쓰레드 이름됨
        KillTest th2 = new KillTest("B");
        KillTest th3 = new KillTest("C");

        th1.start();
        th2.start();
        th3.start();
        int in;
        while(true){
            in = System.in.read();
            if(in == 'A'){
                th1.setFlag(true);
            }else if(in == 'B'){
                th2.setFlag(true);
            }else if( in == 'C'){
                th3.setFlag(true);
            }else if( in == 'M'){
                th1.setFlag(true);
                th2.setFlag(true);
                th3.setFlag(true);
                break;
            }else{
                System.out.println("type again");
            }

        }
    }
}

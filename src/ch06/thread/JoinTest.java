package ch06.thread;

public class JoinTest extends Thread {
    int start,end,total;
    public void run(){
        for(int i = start; i<= end; i++){
            total += i;
        }

    }
    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }
    public static void main(String[] args) {
        JoinTest jt1 = new JoinTest(1,50);
        JoinTest jt2 = new JoinTest(51,100);
        jt1.start();
        jt2.start();
        try{
            jt1.join();//main에서 join을 걸었기때문에 jt1이 dead될때까지 main쓰레드는 non-runnable상태가된다
            jt2.join();//main에서 join을 걸었기때문에 jt2가 dead될때까지 main쓰레드는 non-runnable상태가된다
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        int lastTotal = jt1.total+jt2.total;
        System.out.println("jt1="+jt1.total);
        System.out.println("jt2="+jt2.total);
        System.out.println(lastTotal);//lastTotal의 값이 0인 이유는 lastTotal에 대입할대 jt1,2의 스레드가 연산을 끝내지않았기때문에

    }
}

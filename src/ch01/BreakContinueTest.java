package ch01;
//break & continue
public class BreakContinueTest {
    public static void main(String[] args) {
        int num;
        int sum=0;

        for(num=0; num<100; num++){
            sum += num;
            if(sum>100)
                break;//break문은 반복문이나 switch문에서 현재 위치에서 가장 가까운 블록을 중단하고 블록다음 문장으로 이동하므로 해당 블록을 벗어나기 위해 사용되는 문장입니다.

        }
        System.out.println(sum);
        System.out.println(num);

        for(int i=1; i<=100; i++){
            if(i%3==0){
                System.out.println(i);
                continue;
            }
        }

    }
}

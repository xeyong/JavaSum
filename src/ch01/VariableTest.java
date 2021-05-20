package ch01;
//변수
public class VariableTest {

    public static void main(String[] args) {
        byte bNum = -127;
        int num = 1234567890;
        long lNum = 12345678900L;

        double dNum = 1;
        for(int i=0; i<10000; i++){
            dNum = dNum + 0.1;
        }
        System.out.println(dNum);//기대값은 1001인데 1001.0000000159라는 결과가 나오는데 이는 부동소수점으로인한 약간의 오차이다 (지수부가 0을 표현할수없어서)
    }

}

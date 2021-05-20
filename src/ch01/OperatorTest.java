package ch01;
//연산자
public class OperatorTest {
    public static void main(String[] args) {
        int test = 0;

        for (int i=0; i<=10; i++){
            test += i;
        }
        System.out.println(test);

        int a = 1,b=1;
        int c = a++;
        int d = ++b;
        //b = a를 대입한후 a값 +1, c = a에 +1을한후 a를 대입
        System.out.println("a= "+ a +"b="+ b +"c="+ c+"d="+d);

        int num1 = 10;
        int i = 2;
        if((num1==10)&&(i==2)){
            System.out.println("논리곱테스트");
        }
        if((num1 >10)||(i>=3)){
            System.out.println("논리합테스트");
        }
        else{
            System.out.println("논리합테스트2");
        }
        
    }

}

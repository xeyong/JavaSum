package ch03;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("정수의 사칙연산을 제공합니다");
    }//default를 통해 body가있는 default메서드를 인터페이스에서 구현할수있다.
     //이는 추상화가능한 메서드를 인터페이스에서 구현하여서 각각의 구현클래스에서 오버라이딩할때의 낭비를 막기위해서 이다.

    static int total(int[] arr){
        int total = 0;
        for(int num: arr){
            total += num;
        }
        myStaticMethod();
        return total;
    }//static 메서드또한 구현하여서 인스턴스를 생성할수는 없지만 인터페이스인스턴스.method()로 접근이 가능하다.

    private void myMethod(){
        System.out.println("myMethod");//구현메서드에서 사용하려고
    }

    private static void myStaticMethod(){
        System.out.println("myStaticMethod");//static메서드에서 사용하기위해
    }
}

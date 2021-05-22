package ch02;

import java.util.Calendar;

public class SingletonTest2 {

    public static void main(String[] args) {
        SingletonTest instance = SingletonTest.getInstance();
        SingletonTest instance2 = SingletonTest.getInstance();
        System.out.println(instance);
        System.out.println(instance2);//싱글톤 패턴을 사용하면 한 인스턴스를 사용하기때문에 메모리낭비를 방지할 수 있다

        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        if(calendar == calendar2){
            System.out.println("싱글톤활용한 자바에서제공하는");
        }
        else {
            System.out.println("ss");
        }
        System.out.println(calendar.getTime());
    }
}

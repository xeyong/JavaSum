package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String");//컴파일시에 로드를하는게 아니라 runtime에서 동적으로 로드를한다.

        //local에 클래스가없을때 사용 reflection 프로그래밍
        Constructor[] cons = c.getConstructors();
        for(Constructor co : cons){
            System.out.println(co);
        }
        Method[] m = c.getMethods();
        for(Method mo: m){
            System.out.println(mo);
        }
    }
}

package ch06.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        arrList.add("james");
        arrList.add("john");
        arrList.add("atiffany");

        Stream<String> stream = arrList.stream();//기본자료형에 대한 stream은 따로 클래스가 있지만 참조형은 제네릭으로 있다.
        stream.forEach(a-> System.out.println(a+" "));

        arrList.stream().sorted().forEach(s-> System.out.println(s));
        arrList.stream().map(s->s.length()).forEach(n-> System.out.println(n));//연산이 이루어진다고해서 기존의 자료를 바꾸지는 않는다
        arrList.stream().filter(s->s.length() >=5).forEach(n-> System.out.println(n));

    }
}

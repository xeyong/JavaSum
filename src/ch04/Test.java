package ch04;

public class Test {
    public static void main(String[] args) {
        String a = "dd";
        System.out.println(System.identityHashCode(a));
        a += "s";
        System.out.println(System.identityHashCode(a));
        //String을 연결(+)하면 기존의String에 연결되는 것이 아닌 새로운 문자열이 생성됨으로 메모리 낭비가 발생할수있

    }
}

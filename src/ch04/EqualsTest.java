package ch04;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1 = new Student(100,"lee");
        Student st2 = new Student(100,"lee");

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));//equals를 재정의하지않으면 물리적으로 비교한다.

        System.out.println(st1.hashCode());//만약 equals()재정의하여서 논리적으로 비교하여 true를 반환하도록 했으면
        System.out.println(st2.hashCode());//hashCode()도 재정의하여서 논리적 값을 반환하도록 해야한다.
        System.out.println(System.identityHashCode(st1));//진짜 hashcode값
        System.out.println(System.identityHashCode(st2));

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i = 100;
        System.out.println(i.hashCode());

        Student copyStd = (Student)st1.clone();
        System.out.println(copyStd.toString());
    }
}

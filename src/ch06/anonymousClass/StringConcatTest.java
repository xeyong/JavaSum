package ch06.anonymousClass;

public class StringConcatTest {
    public static void main(String[] args) {
        String str1 ="dd",str2="ddd";

        StringConcat concat = (a,b) -> System.out.println(a+",,"+b);//functionalinterface를 구현
        concat.makeString(str1,str2);//이것이 클래스 없이 가능한 것이아니라.

        StringConcat concat1 = new StringConcat() {
            @Override
            public void makeString(String a, String b) {
                System.out.println(a+",,"+b);//이런식으로 내부적으로 구현되어 있는것이다.
            }
        };
    }

}

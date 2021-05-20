package ch01;
//상수
//상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고
//혹, 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없음
//형변환
//정수형<실수형 작은->큰 묵시적, 큰->작은 명시적(자료의 유실이 발생가능하기때문)
//작은 공간에서 큰공간으로 덜정밀한 타입에서 더정밀한타입(정수->실수)는 자동으로 형변환
public class ConstantTest {
    public static void main(String[] args) {
        final double PI = 3.14;//관례상 상수는 대문자로 표현
        //pi = 3.141592;
        System.out.println(PI);

        int i = 128;
        byte b = (byte)i;
        System.out.println(b);//자료의 문제가 생기는경우때문에 프로그래머에게 책임이있다
    }
}

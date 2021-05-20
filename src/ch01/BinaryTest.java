package ch01;

public class BinaryTest {

    public static void main(String[] args) {

        int num = 10;
        int bNum = 0B1010;//0B는뒤에 binary = 2진수 라는 뜻임
        int oNum = 012;//0은 뒤에 8진수
        int xNum = 0XA;//0은 뒤에 16진수

        System.out.println("10진수="+ num + "//2진수="+bNum+ "//8진수="+oNum +"//16진수="+ xNum);
    }
}

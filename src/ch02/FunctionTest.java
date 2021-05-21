package ch02;

public class FunctionTest {

    public static void main(String[] args) {
        int ok = addNum(1,3);
        System.out.println(ok);
    }

    static int addNum(int num1, int num2){
        int result;
        result = num1+num2;
        return result;

    }
}

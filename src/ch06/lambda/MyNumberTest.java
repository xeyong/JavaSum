package ch06.lambda;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber myNumber = (num1, num2)-> num1>num2? num1: num2;
        System.out.println(myNumber.getMax(10,30));
    }
}

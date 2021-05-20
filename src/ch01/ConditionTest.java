package ch01;

import java.util.Scanner;

//조건연산자
public class ConditionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력값:");
        String sTest = scanner.next();
        System.out.println(sTest);

        System.out.println("입력1:");
        int i1 = scanner.nextInt();
        System.out.println("입력2:");
        int i2 = scanner.nextInt();
        
        int result = i1>i2?i1:i2;//조건연산자
        System.out.println(result+"더큼");
        
    }
}

package ch01;

import java.util.Scanner;
//조건문
public class IfElseTest {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age<8){
            System.out.println("입장료:X");
        }
        else if(age>=8&&age<20){
            System.out.println("입장료:5000");
        }
        else{
            System.out.println("입장료:8000");
        }
    }
}

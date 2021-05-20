package ch01;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("달입력하세요");
        int month = scanner.nextInt();
        int day;
        switch (month){
            case 1: case 4: case 5://이런식으로 같은결과의 case는 옆으로 쓸수있음
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 3:
                day = 30;
                break;
                
            default:
                day = 0;
        }
        System.out.println(month+"의 마지막날은"+day);
        
    }
}

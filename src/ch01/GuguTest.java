package ch01;

import java.util.Scanner;

public class GuguTest {
    public static void main(String[] args) {

        for(int i=1; i<10; i++){
            System.out.println("-------"+i+"단--------");
            for(int j=1; j<10; j++){
                System.out.println(i+"*"+j +"="+(i*j));
            }
        }

    }
}


package ch06.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally");
        }
        System.out.println("강제종료가 아니라고");

    }
}

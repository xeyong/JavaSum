package ch06.i_o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char)fis.read());//read()int를 반환하는데 쭉일고 마지막에 -1을리턴해서그럼
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

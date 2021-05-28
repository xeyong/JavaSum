package ch06.i_o;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        int i;
        byte[] bs = new byte[10];
        try(FileInputStream fis = new FileInputStream("input2.txt")){
            while((i=fis.read(bs)) != -1){
                for(int j = 0; j<i; j++){
                    System.out.print((char)bs[j]);
                }
                System.out.println(":"+i+"바이트읽음");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

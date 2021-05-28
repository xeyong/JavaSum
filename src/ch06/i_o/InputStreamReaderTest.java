package ch06.i_o;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("Reader.txt"))){
            int i;
            while((i=isr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

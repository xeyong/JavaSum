package ch06.i_o;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        int i;
        try(FileReader fr = new FileReader("Reader.txt")){//한글같은경우는 2바이트이기때문에 바이트스트림이 아닌 문자스트림으로 전달해야됨
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

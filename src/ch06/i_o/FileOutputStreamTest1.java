package ch06.i_o;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt")){//FileInputStream과 다르게 OutputStream은 파일이 없을경우 예외가아니라 파일을 생성해줌
            fos.write(65);
            fos.write(75);
            fos.write(95);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

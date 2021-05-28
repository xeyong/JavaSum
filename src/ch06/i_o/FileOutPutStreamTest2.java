package ch06.i_o;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest2 {
    public static void main(String[] args) {
        //FileOutputStream fos = new FileOutputStream("output2.txt",true);//true 는 append기능
        try(FileOutputStream fos = new FileOutputStream("output2.txt",true)){
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i=0; i<bs.length; i++){
                bs[i] = data++;
            }
            fos.write(bs);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

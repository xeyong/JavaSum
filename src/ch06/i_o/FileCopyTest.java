package ch06.i_o;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

public class FileCopyTest {
    public static void main(String[] args) {
        long millisecond = 0;
        try(FileInputStream fis = new FileInputStream("a.zip");
            FileOutputStream fos = new FileOutputStream("copy2.zip")){

            millisecond = System.currentTimeMillis();
            System.out.println(millisecond);
            int i;
            while((i=fis.read()) != -1){
                fos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(millisecond+"소요되었습니다.");

        Socket socket = new Socket();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.readLine();//한줄읽는것
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

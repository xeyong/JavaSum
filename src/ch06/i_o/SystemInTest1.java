package ch06.i_o;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
        int i;

        try {
            InputStreamReader irs = new InputStreamReader(System.in);
            while ((i = irs.read()) != '\n' ){//System의 in은 InputStream이기때문에 바이트단위 스트림이라서 보조스트림이 필요
            System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

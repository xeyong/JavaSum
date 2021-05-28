package ch06.i_o;

import java.io.File;

public class FileTest {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Java_sum\\newFile.txt");
        file.createNewFile();//파일생성

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        file.delete();
    }
}

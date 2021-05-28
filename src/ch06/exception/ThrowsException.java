package ch06.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return  c;
    }

    public static void main(String[] args) {
            ThrowsException te = new ThrowsException();

        try {
            te.loadClass("a.txt", "abc");
        } catch (ClassNotFoundException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){//Exception은 맨 아래에있어야됨
            e.printStackTrace();
        }

    }
}

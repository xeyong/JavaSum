package ch06.serialization;

import java.io.*;
import java.net.Socket;

class Person implements Serializable{//직렬화가 가능한 객체라고 명시
    String name;
    String job;
    transient Socket socket;

    public Person(){}
    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }
    @Override
    public String toString(){
        return name +","+ job;
    }


}

public class Serialization {
    public static void main(String[] args) {
        Person personLee = new Person("lee","programmer");
        Person personKim = new Person("kim","arcithecture");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(personLee);
                oos.writeObject(personKim);

        }catch (IOException e){
            e.printStackTrace();
        }
        try(FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Person pLee = (Person)ois.readObject();
            Person pKim = (Person)ois.readObject();

            System.out.println(pLee.toString());
            System.out.println(pKim.toString());
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

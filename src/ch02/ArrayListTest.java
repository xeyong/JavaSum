package ch02;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("test1",11));
        library.add(new Book("test2",11));
        library.add(new Book("test3",11));

        for(int i=0; i<library.size(); i++){
            library.get(i).showInfo();
        }

    }

}

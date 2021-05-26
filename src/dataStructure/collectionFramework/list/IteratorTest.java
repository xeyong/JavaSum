package dataStructure.collectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }
}

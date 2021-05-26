package dataStructure.collectionFramework.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("일번");
        treeSet.add("김ㅆ");
        treeSet.add("박");
        Iterator ir = treeSet.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }

    }
}

package dataStructure.collectionFramework.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);

        Member memberHong = new Member(1003,"홍길동");
        memberHashSet.addMember(memberHong);

        memberHashSet.showAllMember();
        //넣은순서가 유지되지않는다.
        HashSet<Integer> hashSet = new HashSet<>();
        boolean check;
        check = hashSet.add(3);
        System.out.println(check);
        check = hashSet.add(3);
        System.out.println(check);
        hashSet.add(78);
        Iterator<Integer> ir = hashSet.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());//중복은 허용하지않는다
        }


    }
}

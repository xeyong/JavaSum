package ch06.stream.streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Customer customerLee = new Customer("이순신", 40 ,100);
        Customer customerKim = new Customer("김유신", 20 ,100);
        Customer customerHong = new Customer("홍길동", 13 ,50);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        Stream<Customer> cs = customerList.stream();
        customerList.stream().filter(s-> s.getCustomerAge()>=20).map(s->s.getCustomerName()).sorted().forEach(s-> System.out.println(s));
        cs.map(s->s.getCustomerAge()).forEach(a-> System.out.println(a));
    }
}

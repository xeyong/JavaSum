package ch03;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId("10010");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VipCustomer customerKim = new VipCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId("10011");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        Customer customer = new Customer();
        if(customer instanceof VipCustomer){
            VipCustomer vc = (VipCustomer) customer;
        }
        VipCustomer vc2 = (VipCustomer) customer;//error발생



    }
}

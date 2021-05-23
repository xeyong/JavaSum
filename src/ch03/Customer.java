package ch03;

public class Customer {
    private String customerId;
    private String customerName;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price *bonusRatio;
        return price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String showCustomerInfo(){
        return customerName +"님의 등급은"+ customerGrade+"이며, 보너스포인트는"+bonusPoint;
    }
}

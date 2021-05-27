package ch06.stream.streamTest;

public class Customer {
    private String customerName;
    private int customerAge;
    private int cost;

    public Customer(String customerName, int customerAge, int cost){
        this.customerAge = customerAge;
        this.customerName = customerName;
        this.cost = cost;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "name: "+ customerName +"age: "+customerAge +"cost: "+cost;
    }
}

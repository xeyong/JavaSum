package ch03;

public class VipCustomer extends Customer{

    private double saleRatio;
    private String agentId;

    public VipCustomer(){
        bonusRatio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}

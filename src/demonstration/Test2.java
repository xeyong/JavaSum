package demonstration;

public class Test2 {
    public static void main(String[] args) {
        Who james = new Who("james", 5000);
        Who thomas = new Who("thomas", 10000);
        Bus bus = new Bus();
        Subway subway = new Subway();

       james.takeVehicle(bus);
       thomas.takeVehicle(subway);
       thomas.takeVehicle(bus);

        System.out.println(james.getMoney());
        System.out.println(thomas.getMoney());
    }

}

class Who{
    private String name;
    private int money;

    public Who(String name, int money){
        this.name = name;
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void takeVehicle(Vehicle vehicle){
        this.setMoney(this.getMoney()-vehicle.take());
    }
}
interface Vehicle{
    public int take();
}

class Bus implements Vehicle{
    private final int price = 1000;
    private int busNumber;

    public int take(){
        return price;
    }
}

class Subway implements Vehicle{
    private final int price = 1200;
    private String color;

    public int take(){
        return price;
    }
}
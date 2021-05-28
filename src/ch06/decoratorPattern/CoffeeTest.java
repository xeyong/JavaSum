package ch06.decoratorPattern;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee etiopiaCoffee = new EthiopiaAmericano();
        etiopiaCoffee.brewing();

        Coffee etiopiaLatte = new Latte(etiopiaCoffee);
    }
}

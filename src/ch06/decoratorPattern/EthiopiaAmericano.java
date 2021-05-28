package ch06.decoratorPattern;

public class EthiopiaAmericano extends Coffee{
    @Override
    public void brewing() {
        System.out.println("Ethiopia Americano");
    }
}

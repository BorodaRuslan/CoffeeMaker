package entities;

public class Cappuccino implements Coffee {
    private final String coffeeMame;

    public Cappuccino() {
        this.coffeeMame = "Cappuccino";

    }

    @Override
    public String getProductInformation() {
        return "Your coffee: " + coffeeMame + "." + " Enjoy!";

    }
}

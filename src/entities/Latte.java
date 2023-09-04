package entities;

public class Latte implements Coffee{
    private final String coffeeMame;

    public Latte() {
        this.coffeeMame = "Latte";

    }

    @Override
    public String getProductInformation() {
        return "Your coffee: " + coffeeMame + "." + " Enjoy!";

    }

}

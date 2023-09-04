package entities;

public class Espresso implements Coffee{
    private final String coffeeMame;

    public Espresso() {
        this.coffeeMame = "Espresso";

    }

    @Override
    public String getProductInformation() {
        return "Your coffee: " + coffeeMame + "." + " Enjoy!";

    }
}

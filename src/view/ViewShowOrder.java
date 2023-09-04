package view;

import entities.Coffee;

public class ViewShowOrder {

    public void showOrder(Coffee coffee) {
        System.out.println(coffee.getProductInformation());
    }
}

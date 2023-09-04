package controller;

import entities.*;
import model.ModelCreateProduct;
import view.ViewOrderOptions;
import view.ViewShowOrder;

public class ControllerFilterOrder {
    ModelCreateProduct model;
    ViewShowOrder viewShowOrder;
    ViewOrderOptions optionOrder;

    public ControllerFilterOrder(ModelCreateProduct model, ViewShowOrder viewShowOrder, ViewOrderOptions optionOrder) {
        this.model = model;
        this.viewShowOrder = viewShowOrder;
        this.optionOrder = optionOrder;

    }

    public Coffee filterOptions(int numberOptions) {
        switch (numberOptions) {
            case 1 -> {
                return model.createEspresso();
            }
            case 2 -> {
                return model.createCappuccino();
            }
            case 3 -> {
                return model.createLatte();
            }
            default -> throw new IllegalStateException("Unexpected value: " + numberOptions);
        }
    }

    public void runApp() {
        viewShowOrder.showOrder(filterOptions(optionOrder.options()));
    }
}
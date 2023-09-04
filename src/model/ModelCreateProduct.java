package model;

import entities.Cappuccino;
import entities.Coffee;
import entities.Latte;

public class ModelCreateProduct {
    public Coffee createLatte(){
        return new Latte();
    }
    public Coffee createCappuccino(){
         return new Cappuccino();
    }

    public Coffee createEspresso(){
        return new Cappuccino();
    }


}

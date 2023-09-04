import controller.ControllerFilterOrder;
import model.ModelCreateProduct;
import view.ViewOrderOptions;
import view.ViewShowOrder;


public class AppRunner {
    public static void main(String[] args) {
        appRunner();

    }

    public static void appRunner() {
        ModelCreateProduct createProduct = new ModelCreateProduct();
        ViewShowOrder showOrder = new ViewShowOrder();
        ViewOrderOptions options = new ViewOrderOptions();

        ControllerFilterOrder controller = new ControllerFilterOrder(createProduct, showOrder, options);
        controller.runApp();
    }
}
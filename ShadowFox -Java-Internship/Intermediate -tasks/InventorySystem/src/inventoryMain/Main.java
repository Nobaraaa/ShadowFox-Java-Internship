package inventoryMain;

import inventory.controller.InventoryController;
import inventory.view.InventoryGUI;

public class Main {
    public static void main(String[] args) {
        InventoryController controller = new InventoryController();
        new InventoryGUI(controller);
    }
}
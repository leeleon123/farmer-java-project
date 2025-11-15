package View;

import controllers.FarmerController;
import model.Farmer;

public class FarmerView {
    private FarmerController controller;

    public FarmerView(FarmerController controller) {
        this.controller = controller;
    }

    public void displayAllFarmers() {
        for (Farmer f : controller.getFarmers()) {
            System.out.println(f.getFarmerDetails());
        }
    }

}

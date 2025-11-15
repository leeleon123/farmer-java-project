package main;

import controllers.FarmerController;
import View.FarmerView;
import model.Farmer;
import controllers.NotificationController;
import View.NotificationView;
import View.NotificationGUI;
import View.FarmerGUI;

public class Main {
    public static void main(String[] args) {
        FarmerController farmerController = new FarmerController();
        farmerController.addFarmer(new Farmer("F001", "Ravi", "Organic Vegetables", "ISO-CERT", 4.5));
        farmerController.addFarmer(new Farmer("F002", "Kamal", "Fruit Cultivation", "LOCAL-CERT", 3.0));

        FarmerView farmerView = new FarmerView(farmerController);
        farmerView.displayAllFarmers();

        // notification module
        NotificationController notificationController = new NotificationController();
        NotificationView notificationView = new NotificationView(notificationController);

        notificationView.sendFarmerAlert("Ravi", "Your planting time is optimal today.");
        notificationView.sendConsumerAlert("Suresh", "Fresh produce is now available!");

        new FarmerGUI(farmerController);
        new NotificationGUI(notificationController);
    }
    }



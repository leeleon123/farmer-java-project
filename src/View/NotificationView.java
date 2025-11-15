package View;

import controllers.NotificationController;

public class NotificationView {
    private NotificationController controller;

    public NotificationView(NotificationController controller) {
        this.controller = controller;
    }

    public void sendFarmerAlert(String name, String message) {
        controller.notifyFarmer(name, message);
    }

    public void sendConsumerAlert(String name, String message) {
        controller.notifyConsumer(name, message);
    }
}

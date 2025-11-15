package controllers;

import Methods.SMSNotification;
import Methods.EmailNotification;

public class NotificationController {
    private EmailNotification email = new EmailNotification();
    private SMSNotification sms = new SMSNotification();

    public void notifyFarmer(String name, String message) {
        email.sendMessage(name, message);
        sms.sendMessage(name, message);
    }

    public void notifyConsumer(String name, String message) {
        email.sendMessage(name, message);
    }
}

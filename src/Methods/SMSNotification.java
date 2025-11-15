package Methods;
import model.Notification;

public class SMSNotification implements Notification {
    @Override
    public void sendMessage(String receiver, String message) {
        System.out.println("[SMS] To " + receiver + ": " + message);
    }
}
package Methods;
import model.Notification;
public class EmailNotification implements Notification {


    @Override
    public void sendMessage(String receiver, String message) {
        System.out.println("[EMAIL] To " + receiver + ": " + message);
    }
}

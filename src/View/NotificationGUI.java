package View;
import controllers.NotificationController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotificationGUI extends JFrame{
    private NotificationController controller;

    private JTextField txtReceiver;
    private JTextField txtMessage;

    public NotificationGUI(NotificationController controller) {
        this.controller = controller;

        setTitle("Notification Center");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Receiver Name:"));
        txtReceiver = new JTextField();
        add(txtReceiver);

        add(new JLabel("Message:"));
        txtMessage = new JTextField();
        add(txtMessage);

        JButton btnFarmer = new JButton("Notify Farmer");
        JButton btnConsumer = new JButton("Notify Consumer");

        add(btnFarmer);
        add(btnConsumer);

        btnFarmer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtReceiver.getText();
                String msg = txtMessage.getText();
                controller.notifyFarmer(name, msg);
                JOptionPane.showMessageDialog(null, "Farmer Notification Sent!");
            }
        });

        btnConsumer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtReceiver.getText();
                String msg = txtMessage.getText();
                controller.notifyConsumer(name, msg);
                JOptionPane.showMessageDialog(null, "Consumer Notification Sent!");
            }
        });

        setVisible(true);
    }

}

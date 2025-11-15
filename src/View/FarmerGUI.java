package View;

import controllers.FarmerController;
import model.Farmer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FarmerGUI extends JFrame {

    private FarmerController controller;

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtSpecialization;
    private JTextField txtCertification;
    private JTextField txtFarmSize;
    private JTextArea displayArea;

    public FarmerGUI(FarmerController controller) {
        this.controller = controller;

        setTitle("Farmer Management System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ---- Form Panel ----
        JPanel formPanel = new JPanel(new GridLayout(6, 2));

        formPanel.add(new JLabel("Farmer ID:"));
        txtId = new JTextField();
        formPanel.add(txtId);

        formPanel.add(new JLabel("Name:"));
        txtName = new JTextField();
        formPanel.add(txtName);

        formPanel.add(new JLabel("Specialization:"));
        txtSpecialization = new JTextField();
        formPanel.add(txtSpecialization);

        formPanel.add(new JLabel("Certification:"));
        txtCertification = new JTextField();
        formPanel.add(txtCertification);

        formPanel.add(new JLabel("Farm Size (acres):"));
        txtFarmSize = new JTextField();
        formPanel.add(txtFarmSize);

        JButton btnAdd = new JButton("Add Farmer");
        JButton btnView = new JButton("View All Farmers");

        formPanel.add(btnAdd);
        formPanel.add(btnView);

        // ✅ Add panel to the frame (ONLY ONCE)
        add(formPanel, BorderLayout.NORTH);

        // ---- Display Section ----
        displayArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        // ---- Button Actions ----
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String id = txtId.getText();
                    String name = txtName.getText();
                    String specialization = txtSpecialization.getText();
                    String certification = txtCertification.getText();
                    double size = Double.parseDouble(txtFarmSize.getText());

                    Farmer farmer = new Farmer(id, name, specialization, certification, size);
                    controller.addFarmer(farmer);

                    JOptionPane.showMessageDialog(null, "Farmer Added Successfully!");

                    txtId.setText("");
                    txtName.setText("");
                    txtSpecialization.setText("");
                    txtCertification.setText("");
                    txtFarmSize.setText("");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please check fields.");
                }

            }
        });

        btnView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("");
                controller.getFarmers().forEach(f -> displayArea.append(f.getFarmerDetails() + "\n"));
            }
        });

        setVisible(true);
    }
}
